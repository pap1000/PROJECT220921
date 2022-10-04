import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
    public static void main(String[] args) {
        int sum=0, n=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");

        for(int i=0; i<3; i++) {
            System.out.print(i+">>");

            //사용자가 정수를 입력
            try {
                n = scanner.nextInt();
            }
            //사용자가 정수가 아닌 문자를 입력했을 경우
            catch(InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                //정수가 아닌 토큰을 버림, 인덱스 증가를 방지하기 위해 i-- 이후 continue로 반복
                scanner.next();
                i--;
                continue;
            }

            sum += n;
        }
        System.out.println("합은 " + sum);

        scanner.close();
    }
}