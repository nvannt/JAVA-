import java.util.Scanner;
public class Bai5 {
public static void main(String[] args) {
    int n, sum=0;
    Scanner sc = new Scanner(System.in);
    while(sum <= 100) {
        System.out.print("Nhap vao so nguyen: ");
        n = sc.newInt();
        sum =sum + n;
        System.out.print("Tong =" +sum);
    }
}