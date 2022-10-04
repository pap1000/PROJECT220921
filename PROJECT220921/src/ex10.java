public class ex10 {
    public static void main(String[] args){
        int arr[][] = new int [4][4];
        int row, col, count = 0;

        while(count < 10){
            row = (int)(Math.random()*4);
            col = (int)(Math.random()*4);
            if(arr[row][col]==0){
                arr[row][col] = (int)(Math.random()*10+1);
                count++;
            }
        }

        for(int i=0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
