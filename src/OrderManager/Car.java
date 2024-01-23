package OrderManager;

public class Car {  // 데이터로서 다뤄질 대상임
    //차의 종류
    public enum CarOption{
        SEDAN, SUV, HATCHBACK, SPORTSCAR
    }
    private CarOption carType;

    public CarOption getCarType() {
        return carType;
    }

    public void setCarType(CarOption carType) {
        this.carType = carType;
    }

    public static void main(String [] args){
        Car myCar = new Car();
        //1.SEDAN 선택할 경우 출력문
        myCar.setCarType(CarOption.SEDAN);
        System.out.println(myCar.getCarType()+"을 선택하셨습니다!");
        //2. SUV 선택할 경우 출력문
        myCar.setCarType(CarOption.SUV);
        System.out.println(myCar.getCarType()+"을 선택하셨습니다!");
        //3. HATCHBACK을 선택할 경우 출력문
        myCar.setCarType(CarOption.HATCHBACK);
        System.out.println(myCar.getCarType()+"을 선택하셨습니다!");
        //4. SPORTSCAR를 선택할 경우 출력문
        myCar.setCarType(CarOption.SPORTSCAR);
        System.out.println(myCar.getCarType()+"을 선택하셨습니다!");


    }

}
