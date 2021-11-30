package Homework;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if (map.containsKey(id)) {
                System.out.print("password: ");
                String pass = sc.nextLine();
                if (map.get(id).equals(pass)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");

                }
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }
}
