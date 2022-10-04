import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count=0;
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
        int number = scanner.nextInt();

        //-1이 입력되기 전까지 계속 합산, 만약 10 20 15 -1 30 을 입력하면 마지막 30은 합에 포함되지 않음
        while(number != -1) {
            count++;
            sum += number;
            number = scanner.nextInt();
        }

        //count는 입력된 숫자의 갯수, count가 0이 아니면 count의 값과 평균값을 출력
        if(count == 0)
            System.out.println("입력된 수가 없습니다.");
        else {
            System.out.print("정수의 개수는 " + count + "개, ");
            System.out.println("평균은 " + (double)sum/count + "입니다.");
        }
        scanner.close();
    }
}

