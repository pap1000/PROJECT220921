import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //무한루프
        while(true) {
            System.out.print("나뉨수를 입력하시오:");
            int dividend = scanner.nextInt(); // 나뉨수 입력
            System.out.print("나눗수를 입력하시오:");
            int divisor = scanner.nextInt(); // 나눗수 입력

            //정상적으로 연산을 완료해야 break를 통해 무한루프를 벗어남
            try {
                System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
                break;
            }
            //예외 클래스(0으로 나누었을 경우)
            catch(ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
            }
        }

        scanner.close();
    }
}
