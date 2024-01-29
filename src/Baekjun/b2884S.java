package Baekjun;

import java.util.Scanner;

public class b2884S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int totalMinutes = H * 60 + M; // 전체 분으로 계산

        // 45분 빼기
        totalMinutes -= 45;

        // 음수 처리 및 24시간 넘어가면 조정
        totalMinutes = (totalMinutes + 24 * 60) % (24 * 60);

        // 시간과 분 계산
        int resultH = totalMinutes / 60;
        int resultM = totalMinutes % 60;

        System.out.println(resultH + " " + resultM);
    }
}
