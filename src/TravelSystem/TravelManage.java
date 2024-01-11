package TravelSystem;

public class TravelManage implements TravelManageInterface{
    private int visitor=15;
    public TravelManage(int visitor){

        this.visitor=visitor;
    }
    @Override
    public void count(KoreaCitizen koreaCitizen){
        int visitorCount = koreaCitizen.getCount();

        if(visitorCount>15){
            System.out.println("단체입국 해당자입니다.");
        }
        else {System.out.println("단체입국 해당자가 아닙니다.");}
    }

    @Override
    public void location(KoreaCitizen koreaCitizen) {
        System.out.println("현재 위치는 "+koreaCitizen.getLocation());
    }

    @Override
    public void citizennum(KoreaCitizen koreaCitizen) {
        int visitorNum =KoreaCitizen.getCitizennum();
        if(visitorNum==1){ //0이면 여행 1이면 이민
            System.out.println("여기는 이민심사대입니다. 여행은 반대편입니다.");
        }
        else{System.out.println("환영합니다 여행입국심사대입니다.");}

    }
}
