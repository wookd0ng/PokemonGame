package Baekjun;

import java.util.Scanner;

public class b14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y=0;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>0){
            if(y>0){
                System.out.println(1);
            }
            else if (y<0){
                System.out.println(4);
            }
        }
        if (x<0){
            if(y>0){
                System.out.println(2);
            } else if (y<0) {
                System.out.println(3);
            }
        }
    }
}
