package TravelSystem;

public class Main {
    public static void main(String [] args){
        System.out.println("1.-------------");
        AllinterFace myClass = new AllinterFace() {
            @Override
            public void immigration(KoreaCitizen koreaCitizen) {

            }
        }; //MyClass  객체 생성

        myClass.immigration();
        System.out.println("2.-------------");
        myClass.citizennum();
        System.out.println("3.-------------");
        KoreaCitizen koreaCitizen = new KoreaCitizen("홍깅동", 30,"한국","한국", 1, 1,1);
        myClass.count(koreaCitizen);
        myClass.location(koreaCitizen);
        myClass.citizennum(koreaCitizen);
    }
}
