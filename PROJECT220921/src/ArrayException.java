public class ArrayException {
    public static void main (String[] args) {
        //크기가 5인 int형 배열 선언
        int[] arr = new int[5];
        arr[0] = 0;

        //크기가 5인 배열은 index범위가 1~4이기 때문에 i=5 일 때 예외 발생
        try {
            for (int i=0; i<5; i++) {
                arr[i+1] = i + 1 + arr[i];
                System.out.println("arr[" + i + "]" + "=" +arr[i]);
            }
        }
        //예외 클래스(index 범위를 벗어남)
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
