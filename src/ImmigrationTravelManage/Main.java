package ImmigrationTravelManage;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //personcoin 1,2는 각각 잉글랜드 여행, 한국 여행이고(위치만 변경됨) 3,4는 잉글랜드 이민, 한국 이민입니다(국적,위치 변경됨).
        //입국 제한 대상국은 North Korea. 철자 주의. 대문자 포함됨.
        //단체 입국 인원은 11명이상입니다.
        //망명 신청은 스탬프란에 SOS라고 입력하면 됩니다. 모두 대문자.
        PersonStruct person1 = new PersonStruct("홍길동", 30, "남", "KOREA", 3, "KOREA",12,"SOS");
        CountryStruct korea = new CountryStruct("KOREA", 50000000, "SEOUL", "ASIA");

        System.out.println("-----신원조회 시작하겠습니다-----\n" +
                "이름: " + person1.personname + "\n" +
                "나이: " + person1.personage + "\n" +
                "성별: " + person1.persongender + "\n" +
                "국적: " + person1.personcountry + "\n" +
                "현위치: " + person1.personlocation + "\n----------");

        //person1.getPersoncoin(); -> 여행,이민을 가시는 군요 return문이 나와서 필요가 없어짐.
        //String currentCountry = person1.getPersonCountry();
        if ("North Korea".equals(person1.personcountry)) {
            System.out.println("입국제한입니다.");
            System.out.println("----------");

            return;
        } else {
            System.out.println("입국제한 대상자가 아닙니다.");
            System.out.println("----------");

        }
        TravelManger travelManger = new TravelManger(); //구현 클래스 호출
        ImmigrationManager immigrationManager = new ImmigrationManager(); //구현 클래스 호출


        if(person1.personcoin == 1){
            System.out.println("여행 가시는 군요?");
            travelManger.changeLocation(person1 ,"ENGLAND");
        }

        if(person1.personcoin == 2){
            System.out.println("여행 가시는 군요?");
            travelManger.changeLocation(person1 ,"KOREA");
        }


        if(person1.personcoin == 3){
            System.out.println("이민 가시는 군요?");
            immigrationManager.changeCountry(person1 ,"ENGLAND");
            travelManger.changeLocation(person1 ,"ENGLAND");

        }
        else if(person1.personcoin == 4){
            System.out.println("이민 가시는 군요?");
            immigrationManager.changeCountry(person1 ,"KOREA");
            travelManger.changeLocation(person1 ,"KOREA");

        }

        if(person1.member>10){
            System.out.println("단체 입국 해당자입니다.");
            System.out.println("----------");

        }
        else {
            System.out.println("단체 입국 해당자가 아닙니다.");
            System.out.println("----------");

        }
        if(Objects.equals(person1.stamp, "SOS")){
            System.out.println("망명신청자입니다. 각국 대사관으로 문의하세요.");
            System.out.println("----------");

        }
        else {System.out.println("망명 해당자가 아닙니다.");}
        System.out.println("----------");

    }
}

