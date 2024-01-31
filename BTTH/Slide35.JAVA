import java.util.Scanner;
public class Slide35 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        b = sc.nextInt();
        int min = a;
        if(a > b)
        min = b;
        System.out.println("So nho nhat trong 2 so " + a + " va " + b + " la " + min);
    }
    sc.close();
}