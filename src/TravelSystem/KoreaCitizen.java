package TravelSystem;

import lombok.Getter;

public class KoreaCitizen { //필드

    private String name = "홍길동";
    private int age = 25;
    private String country = "한국";
    private String location = "한국";
    private int count = 1; //인원수

    @Getter
    private static int citizennum = 0; //0이면 여행,1이면 이민

    public KoreaCitizen(String name, int age, String country, String location, int count, int citizennum) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.location = location;
        this.count = count;
        KoreaCitizen.citizennum = citizennum;
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

    public int getImmigration() {
        return citizennum;
    }
}
