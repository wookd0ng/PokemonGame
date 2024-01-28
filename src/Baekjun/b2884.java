package Baekjun;

import java.util.Scanner;

public class b2884 {
    //조건1. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
    //조건2. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
    //조건3. 입력한 시간보다 45분 앞서게 시간을 나타냄.
    public static void main(String[] args) {
        int H,M,X,Y; // X는 분에 대한 연산저장, Y는 시간에 대한 연산저장
        Scanner sc = new Scanner(System.in);
        //시간을 H로, 분을 M으로 입력받는다.
        H =sc.nextInt();
        M =sc.nextInt();
        if(H>=0 && H<=23){
            if(M>=0 && M<=59){ //조건1에 대한 부분을 이중 if문으로 받고
                if(M<45 && H!=0){ //분이 45보다 작을때 시간도 -1 해야하고 분도 연산과정 들어가야해서 if문 사용
                X = (M-45); //입력받은 분에 대해서 -45을 해줌
                X = (X+60);
                Y = (H-1); //
                    System.out.print(Y+" ");
                    System.out.print(X);
                }
                else if(M>45){

                    X=(M-45);

                    // 분이 45보다 커서 시간도 -1 안해줘도 됨.
                    System.out.print(H+" ");
                    System.out.print(X);
                }
                if(H == 0 && M<45){
                    X=(M-45);
                    X=(X+60);
                    H=23;
                    System.out.print(H+" ");
                    System.out.print(X);
                }
                }
        }

    }
}
