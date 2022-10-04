public class ForSample {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=10; i++) {
            sum += i;
            System.out.print(i);

            //i가 9이하면 +, 10이면 =와 함께 합을 출력
            if(i<=9)
                System.out.print("+");
            else {
                System.out.print("="+sum);
            }
        }
    }
}