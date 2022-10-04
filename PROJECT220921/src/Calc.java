public class Calc {
    public static void main (String[] args) {
        double sum = 0.0;

        //args의 각 원소를 합산
        for (int i=0; i<args.length; i++)
            //문자열을 double로 변환하여 합산
            sum += Double.parseDouble(args[i]);

        System.out.println("합계 :" + sum);
    }
}