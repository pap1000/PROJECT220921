public class foreachEx {
    enum Week { 월, 화, 수, 목, 금, 토, 일 }
    public static void main(String[] args) {
        //배열을 선언하여 값을 저장, sum을 선언
        int [] n = { 1,2,3,4,5 };
        int sum = 0;
        String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

        //k의 값들을 합산 후 출력
        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);

        //s의 값들을 반복하여 출력
        for (String s : names)
            System.out.print(s + " ");  //띄어쓰기
        System.out.println();

        //Week day의 값을 출력
        for (Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();
    }
}