package TravelSystem;

import lombok.Getter;

public class KoreaCitizen { //필드

    private String name = "홍길동";
    private int age = 25;
    private String country = "한국";
    private String location = "한국";
    private int count = 1; //인원수
    private static int license = 1; //1이면 가지고 있음. 0이면 없음

    @Getter
    private static int citizennum = 0; //0이면 여행,1이면 이민

    public KoreaCitizen(String name, int age, String country, String location, int count, int citizennum, int license) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.location = location;
        this.count = count;
        this.citizennum = citizennum;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public static int getCitizennum() {
        return citizennum;
    }

    public static int getlicense() {
        return license;
    }

    private static void license() {
        getlicense();
    }
}
