package TravelSystem;

public abstract class ImmigrationManage implements InterfaceZip {

    @Override
    public void immigration() {
        int visitorlicense =KoreaCitizen.getlicense();
        if (visitorlicense == 1) {
            System.out.println("발급증을 소지하고 계시네요. 이민 가능합니다.");
        } else {
            System.out.println("발급증을 소지하고 계시지 않습니다. 이민 불가능합니다.");
        }
    }

    @Override
    public void citizennum() {
        int visitorNum = KoreaCitizen.getCitizennum(); // 메소드명 수정
        if (visitorNum == 1) {
            System.out.println("여기는 여행입국심사대입니다. 이민은 반대편입니다.");
        } else {
            System.out.println("환영합니다 여행입국심사대입니다.");
        }
    }

    public abstract void immigration(KoreaCitizen koreaCitizen);
}
