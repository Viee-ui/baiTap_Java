import java.util.Scanner;

public class bt2{
    public static void main (String[] args)

    {
        int n;
        System.out.println("Nhap vao so nguyen");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch(n)
        {
            case 0: System.out.println("Không");break;
            case 1: System.out.println("Mot");break;
            case 2: System.out.println("Hai");break;
            case 3:System.out.println("Ba");break;
            case 4: System.out.println("Bon");break;


            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
    }
}

