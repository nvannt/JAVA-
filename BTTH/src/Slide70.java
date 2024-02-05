import java.util.Scanner;
public class Slide70 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        }while(n < 0);
        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0;i < n; i++) {
            System.out.println("Nhap phan tu thu"+i +": ");
            A[i] = sc.nextInt();
        }
        double sum =0;
        for (int i=0; i<n; i++) {
            if (A[i] %2 == 0) {
                sum+=A[i];
            }
        }
        System.out.println("sum:" +sum);
        sc.close();
    }
}
    
