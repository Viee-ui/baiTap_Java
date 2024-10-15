public class MyPolynomial {
    private double[] coeffs;

    // Constructor
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Lấy bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Chuyển đổi đa thức thành chuỗi
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]).append("x^").append(i);
            }
        }
        return sb.toString();
    }

    // Tính giá trị của đa thức tại x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Cộng hai đa thức
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double thisCoeff = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double rightCoeff = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            resultCoeffs[i] = thisCoeff + rightCoeff;
        }

        return new MyPolynomial(resultCoeffs);
    }

    // Nhân hai đa thức
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}
