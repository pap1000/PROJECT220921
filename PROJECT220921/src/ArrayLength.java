import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        //크기가 5인 int형 배열과 sum을 선언
        int arr[] = new int[5];
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(arr.length + "개의 정수를 입력하세요>>");

        //배열의 크기만큼 정수를 입력받고 합산
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.print("평균은 " + (double)sum/arr.length);
        scanner.close();
    }
}