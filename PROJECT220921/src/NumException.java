public class NumException {
    public static void main (String[] args) {
        //변환시킬 문자형 배열을 선언
        int i = 0;
        String[] numbers = {"23", "12", "3.141592", "998"};

        try {
            for (i=0; i < numbers.length; i++) {
                int j = Integer.parseInt(numbers[i]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        }
        //예외처리 클래스(정수가 아닌 문자열을 정수로 변환)
        catch (NumberFormatException e) {
            System.out.println(numbers[i] + "는 정수로 변환할 수 없습니다.");
        }
    }
}