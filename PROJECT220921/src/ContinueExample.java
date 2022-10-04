import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 5개 입력하세요.");

        for(int i=0; i<5; i++) {
            int n = scanner.nextInt();
            //양수가 아닐 경우 i++ 후 다시 반복
            if(n<=0)
                continue;
            //양수일 경우 합산
            else
                sum += n;
        }

        System.out.println("양수의 합은 " + sum);
        scanner.close();
    }
}

