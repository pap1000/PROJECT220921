public class IrregularArray {
    public static void main (String[] args) {
        //2차원 배열을 선언 후 각 1차원 배열을 다른 크기의 int형 배열로 선언
        int arr[][] = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[2];

        //1행마다 10, 1열마다 1씩 증가시키고 1행 1열은 10으로 시작
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (i+1)*10 + j;

        //각각의 배열의 값들을 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][ j] + " "); //열별로 띄어쓰기
            System.out.println();
        }
    }
}