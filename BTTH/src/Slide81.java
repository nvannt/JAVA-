import java. util.Scanner;
public class Slide81 {
public static void main(String[] args) {
    int m,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao so dong cua ma tran: ");
    m = sc .nextInt();
    System.out.println("nhap vao so cot cua ma tran: ");
    n = sc .nextInt();
    int A[] [] = new int[m] [n];
    System.out.println("nhap cac phan tu cho ma tran: ");
    for (int i = 0;i < m;i++) {
        for(int j = 0;j < n;j++) {
            System.out.print("A[" + i + "] [" + j + "]= ");
            A[i][j] = sc.nextInt();
        }
    }
    int max = A[0] [0];
    for (int i = 0; i<m ; i++) {
        for (int j =0 ;j < n; j++) {
            if (max < A[i][j]) {
                max = A[i][j];
        }
    }
    }  
    System.out.println("phan tu lon nhat trong ma tran = "+ max);  
    sc.close();  
}
}



    

