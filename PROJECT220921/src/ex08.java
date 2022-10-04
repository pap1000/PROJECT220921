import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[];
        int n;

        System.out.print("정수 몇개?>");
        n = scanner.nextInt();
        arr = new int[n];

        for(int i=0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100+1);
            for(int j=0; j < arr.length; j++){
                if(i!=j)
                    if(arr[i]!=arr[j])
                        continue;
                    else {
                        arr[i] = (int) (Math.random() * 100 + 1);
                        j--;
                    }
            }
        }
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
