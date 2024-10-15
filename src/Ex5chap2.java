import java.util.Scanner;
public class Ex5chap2 {
    static String hoTen;
    static String diaChi;
    static double diemToan;
    static double diemVan;
    static double diemHoa;
    static double diemTB;

    public static void main(String[] args) {
        nhapThongTin();
        diemTB = tinhDiemTB(diemToan, diemVan, diemHoa);
        inThongTin(hoTen, diaChi, diemToan, diemVan, diemHoa, diemTB);
    }

    public static void nhapThongTin(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Dia chỉ: ");
        diaChi = input.nextLine();
        System.out.print("Diem toan: ");
        diemToan = input.nextInt();
        System.out.print("Diem van: ");
        diemVan = input.nextInt();
        System.out.print("Diem hoa: ");
        diemHoa = input.nextInt();
    }

    public static void inThongTin(String hoTen, String diaChi, double diemToan,
                                  double diemVan, double diemHoa, double diemTB){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chỉ: " + diaChi);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem van: " + diemVan);
        System.out.println("Diem hoa: " + diemHoa);
        System.out.println("Diem trung binh: " + diemTB);
    }

    public static double tinhDiemTB(double diemToan, double diemVan, double diemHoa){
        return (diemToan + diemVan + diemHoa)/3;
    }



}
