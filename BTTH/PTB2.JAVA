import java.util.Scanner;
public class Phuongtrinhbacnhat {
    public static void main(String[] args){
        double hesoA,hesoB,nghiemX,hesoC,delta;
        Scanner sc = new scanner(System.in);
        System.out.println(x:"A=");
        hesoA = sc.nextDouble();
        Scanner sc = new scanner(System.in);
        System.out.println(x:"B=");
        hesoB = sc.nextDouble();
        Scanner sc = new scanner(System.in);
        System.out.println(x:"C=");
        hesoC = sc.nextDouble();
        }
    if(hesoA == 0) {
        System.out.println(x:"Khong phai phuong trinh bac nhat");
    }else{
        delta = Math.pow(hesoB,b:2) - 4 * hesoA * hesoC;
       if(delta < 0) {
        System.out.println(x:"Phuong trinh vo nghiem");
       }else if (delta == 0) {
        nghiemX1 = nghiemX2 =(-hesoB/(2*hesoA));
        System.out.println("Phuong trinh co nghiem kep");
       }else{
        nghiemX1=(-hesoB + Math.sqrt(delta))/(2*hesoA);
        nghiemX2=(-hesoB - Math.sqrt(delta))/(2*hesoA);
        System.out.println(x:"Phuong trinh co 2 nghiem kep");
       }
   }
   }