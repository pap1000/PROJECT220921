public class ReturnArray {
    static int[] makeArray() {
        //크기가 4인 int형 1차원 배열 선언
        int temp[] = new int[4];

        //배열의 값들을
        for (int i=0; i<temp.length; i++)
            temp[i] = i + 1;

        //입력된 배열을 반환
        return temp;
    }

    public static void main (String[] args) {
        int arr[];
        //MakeArray로부터 배열을 반환받음
        arr = makeArray();

        //배열의 모든 원소들을 출력
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}