import java.util.Scanner;

public class  Ex6chap2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n>=0){
            System.out.println("Day la so nguyen duong");
        }
        else {
            System.out.println("Day la so nguyen am");

        }
    }
}
