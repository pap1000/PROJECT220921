import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료합니다.");

        //무한루프
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();

            //입력값이 exit일 경우 break를 통해 무한루프를 벗어남
            if(text.equals("exit"))
                break;
        }

        System.out.println("종료합니다...");
        scanner.close();
    }
}
