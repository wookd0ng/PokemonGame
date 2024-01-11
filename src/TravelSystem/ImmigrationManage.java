package TravelSystem;

import javax.swing.*;

public class ImmigrationManage implements ImmigrationManageInterface {


    @Override
    public void immigration(KoreaCitizen citizen) {
        int citizenImmigration = citizen.getImmigration();
        if (citizenImmigration == 0) {
            System.out.println("이민 가능합니다.");
        } else {
            System.out.println("이민 불가능합니다.");
        }
    }

    @Override
    public void citizennum(KoreaCitizen koreaCitizen) { //koreacitizen에서 선언한 citizennum을 get으로 가져옴
        int visitorNum =KoreaCitizen.getCitizennum();
        if(visitorNum==1){
            System.out.println("여기는 여행입국심사대입니다. 이민은 반대편입니다.");
        }
        else{System.out.println("환영합니다 여행입국심사대입니다.");}

    }
}
