import java.util.*;
public class Ex5chap1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen: ");
        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println(a+ " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a+ " mod " + b + " = " + (a%b));
        System.out.println(a+ " div " + b + " = " + (a/b));
    }
}
