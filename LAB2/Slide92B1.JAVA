import java.util.Scanner;
public class Slide92B1 {
    public static void main(String[] args) {
     double a , b;
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap vao so thu 1:");
     a = sc.nextDouble();
     System.out.println("Nhap vao so thu 2:");
     b = sc.nextDouble();
    double tong = a + b;
    System.out.println(a + "+" + b + "=" + tong);
    double hieu = a - b;
    System.out.println(a + "-" + b + "=" + hieu);
    double tich = a * b;
    System.out.println(a + "*" + b + "=" + tich);
    double thuong = a / b;
    System.out.println(a + "/" + b + "=" + thuong);
    int phandu = (int)a % (int)b;
    System.out.println(a + "%" + b +"=" + phandu);
    
    System.out.println("Ket qua so sanh bang" + a + "va" + b + "la" + (a == b));
    System.out.println("Ket qua so sanh khong bang" + a + "va" + b + "la" + (a != b));
    System.out.println("Ket qua so sanh lon hon" + a + "va" + b + "la" + (a > b));
    System.out.println("Ket qua so sanh lon hon hoac bang" + a + "va" + b + "la" + (a >= b));
    System.out.println("Ket qua so sanh nho hon" + a + "va" + b + "la" + (a < b));
    System.out.println("Ket qua so sanh nho hon hoac bang" + a + "va" + b + "la" + (a <= b));
    sc.close();
    }
  }