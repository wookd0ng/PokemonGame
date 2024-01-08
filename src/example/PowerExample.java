package example;

import java.util.Scanner;

public class PowerExample {
    public static void main(String[] args){
        PowerOnOff poweronoff = new PowerOnOff("on","off");
        Scanner sc = new Scanner(System.in);
        int coin=0;
        int channel=0;
        String name = null;
        System.out.println("전원을 켜려면 1번, 끄려면 1번을 제외한 아무버튼이나 누르고 엔터를 입력하세요.");
        coin = sc.nextInt();
        if(coin == 1){poweronoff.setPowerOn();} // 전원이 켜졌습니다 출력됨
        else poweronoff.setPowerOff();
        System.out.println("채널을 입력해야 합니다. 안내에 따라 숫자만 입력하세요.");
        System.out.println("스포츠 채널 = 10번, 뉴스 채널 = 20번, 예능 채널 = 30번, 유투브 = 40번");
        channel = sc.nextInt();
        switch (channel){
            case 10: name = "스포츠 채널을 켰습니다";
            case 20: name = "뉴스 채널을 켰습니다";
            case 30: name = "예능 채널을 켰습니다";
            case 40: name = "유투브를 틀었습니다";
        }
        System.out.println("사용자가 틀었던 채널은 "+channel+" 번이고, " +name+"\n"+"이상입니다.");



    }
}
