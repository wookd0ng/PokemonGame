package ImmigrationTravelManage;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Main {
    public static void main(String[] args) {
        //이런식으로 이민이랑 여행 서비스 넣어야댐
        PersonStruct person1 = new PersonStruct("홍길동",30,"남","한국",1,"KOREA");
        CountryStruct korea = new CountryStruct("KOREA", 50000000, "SEOUL", "ASIA");
        CountryStruct england = new CountryStruct("ENGLAND", 56000000, "LONDON", "EUROPE");

        System.out.println("1.여행 서비스\n2.이민서비스");
        System.out.println("신원조회 시작하겠습니다" + "이름 :" + person1.personname+"\n"+
                                                 "나이 :"+person1.personage+"\n"+
                                                "성별 :"+person1.persongender+"\n"+
                                                "국적 :"+person1.personcountry+"\n"+
                                                "현위치 :"+person1.personlocation);





        //여행관리 인터페이스랑 국적 관리 인터페이스
        //여행 관리는 위치만 바꾸고 국적관리는 나라 바꾸기
        System.out.println("지금 방문하시는 나라는 " + korea.countryName + "입니다.\n" + "인구수는 " + korea.populaTion + "이고, 속한 대륙은 " + korea.continent + ", 수도는 " + korea.capital + "입니다.\n");


        System.out.println("지금 방문하시는 나라는 " + england.countryName + "입니다.\n" + "인구수는 " + england.populaTion + "이고, 속한 대륙은 " + england.continent + ", 수도는 " + england.capital + "입니다.\n");


    }
}
