import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rsp[] = {"가위", "바위", "보"};
        String User, Comp;
        int n;

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        do {
            System.out.print("가위 바위 보!>> ");
            User = scanner.next();
            if(User.equals("그만")) break;

            n = (int)(Math.random()*3);
            Comp=rsp[n];
            if(User.equals("가위")) {
                if(rsp[n].equals("가위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 비겼습니다.");
                    continue;
                }
                else if(rsp[n].equals("바위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 졌습니다.");
                    continue;
                }
                else if(rsp[n].equals("보")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 이겼습니다.");
                    continue;
                }
            }
            else if(User.equals("바위")) {
                if(rsp[n].equals("가위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 이겼습니다.");
                    continue;
                }
                else if(rsp[n].equals("바위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 비겼습니다.");
                    continue;
                }
                else if(rsp[n].equals("보")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 졌습니다.");
                    continue;
                }
            }
            else if(User.equals("보")) {
                if(rsp[n].equals("가위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 졌습니다.");
                    continue;
                }
                else if(rsp[n].equals("바위")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 사용자가 이겼습니다.");
                    continue;
                }
                else if(rsp[n].equals("보")) {
                    System.out.println("사용자 = " + User + " , 컴퓨터 = " + Comp + " 비겼습니다.");
                    continue;
                }
            }
            System.out.print("사용자 = "+User+" , 컴퓨터 = "+Comp+" ");
        }while(true);

        System.out.println("게임을 종료합니다...");
        scanner.close();
    }

}