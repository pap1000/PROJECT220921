public class DoWhileSample {
    public static void main (String[] args) {
        char a = 'a';
        //z가 될 때까지 출력, 우선 실행한 뒤에 조건을 확인
        do {
            System.out.print(a);
            a = (char) (a + 1);
        } while (a <= 'z');
    }
}