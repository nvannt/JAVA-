import java.util.Scanner;
public class Slide92B2 {
    public static void main(String[] args){
     int a;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhap vao 1 so: ");
     a = scanner.nextInt();
     if ( a % 2 == 0)
    {
       System.out.println(" a la so chan: ");
    }
    else{
        System.out.println(" a la so le: ");
    }
    scanner.close();
}
}
