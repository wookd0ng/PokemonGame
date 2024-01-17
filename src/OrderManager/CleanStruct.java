package OrderManager;

import java.util.HashMap;

public class CleanStruct {
    private HashMap<String,Integer> carInfo; //

    public CleanStruct(){
        this.carInfo = new HashMap<>(); //carInfo에 대한 멤버변수 선언.
    }


    public CleanStruct(HashMap<String, Integer> carInfo) {
        this.carInfo = carInfo;
    }

    public HashMap<String, Integer> getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(HashMap<String, Integer> carInfo) {
        this.carInfo = carInfo;
    }
}
