package Homework;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gcd = 0;
        System.out.print("두 수를 입력하세요:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        while(m!=0) {
            if(m<n) {
                gcd = m;
                m = n;
                n = gcd;
            }
            m = m - n;
        }
        System.out.println("두 수의 최대공약수는 "+n+"입니다." );
    }
}

