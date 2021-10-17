package Homework;
import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        System.out.print("단어/문장을 입력하세요:");

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int flag = 0;
        char[] array = new char[10000];
        array = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            if (array[i] != array[s.length() - i - 1])
                flag = 1;
        }
        if (flag == 0)
            System.out.print("회문입니다.");
        else
            System.out.print("회문이 아닙니다.");
    }
}