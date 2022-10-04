import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int [] bill = new int[8];
        int Money;

        System.out.print("금액을 입력하시오>>");
        Money = scanner.nextInt();

        for(int i=0; i < 8; i++) {
            bill[i] = Money / unit[i];
            Money -=  bill[i]*unit[i];
            if(bill[i]!=0)
                System.out.printf("%d원 짜리 : %d개\n", unit[i], bill[i]);
        }
    }
}
