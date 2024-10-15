import java.util.Scanner;
public class Ex6chap1 {
    public static void main(String[] args) {
        double R;
      final float pi = 3.1415f;
        Scanner k = new Scanner(System.in);
        System.out.print("Nhap ban kinh R: ");
        R = k.nextDouble();
        System.out.println("Circle area = "+R*R*pi);
        System.out.print("Circle perimeter = "+2*pi*R);

    }
}
