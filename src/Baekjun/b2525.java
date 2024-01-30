package Baekjun;

import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력받기
        String inputLine = sc.nextLine(); //시간과 분을 받을 nextLine 메소드 사용
        String tokens [] = inputLine.split(" ");

            if (tokens.length >= 2) {
                String A = tokens[0]; //A는 시간
                String B = tokens[1]; //B는 분
                String C = sc.next(); //C는 소요시간
                int intA = Integer.parseInt(A);
                int intB = Integer.parseInt(B);
                int intC = Integer.parseInt(C);
                if ((intA>=0 && intA<=23)&&(intB>=0 && intB<=59)) {

                    int Ga1 = (intA * 60 + intB + intC); //처음 입력받은 (시간 * 60 + 분 + 소요시간)의 저장값
                    int sigan = Ga1 / 60;
                    int bun = (Ga1 % 60);

                        if(sigan>23) {
                            sigan = sigan - 24;
                        }
                            System.out.println(sigan + " " + bun);
                }
            }




    }
}
