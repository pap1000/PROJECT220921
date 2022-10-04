public class NestedLoop {
    public static void main(String[] args) {
        //i값은 1단~9단
        for(int i=1; i<10; i++) {
            //j값은 각 단의 곱셈이며 해당 구구셈을 출력
            for(int j=1; j<10; j++) {
                System.out.print(i +"*" + j + "="+ i*j);
                //각 연산마다 같은 간격(탭)으로 띄움
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}