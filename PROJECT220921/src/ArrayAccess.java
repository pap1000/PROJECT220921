import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        //크기가 5인 int형 배열을 생성
        int arr[] = new int[5];
        int max=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");

        //index 0~4까지 배열에 저장하면서 비교를 통해 max값을 변경
        for(int i=0; i<5; i++) {
            arr[i] = scanner.nextInt();

            if(arr[i] >max)
                max = arr[i];
        }

        System.out.print("가장 큰 수는 " + max + "입니다.");
        scanner.close();
    }
}