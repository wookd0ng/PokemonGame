package ImmigrationTravelManage;

public class PersonStruct {
    String personname; ///사람 이름
    int personage; // 사람 나이
    String persongender; //사람 성별
    String personcountry; // 사람 국적
    int personcoin; // 여행인지 이민인지 구별하는 코인.
    String personlocation;

    public PersonStruct(String personname, int personage, String persongender,
                        String personcountry, int personcoin,String personlocation){
        this.personname=personname;
        this.personage=personage;
        this.persongender=persongender;
        this.personcountry=personcountry;
        this.personcoin=personcoin;
        this.personlocation=personlocation;
    }

    public String getPersonCountry() {
        return personcountry;
    }

    public void setPersonCountry(String personcountry) {
        this.personcountry = personcountry;
    }

    // 위치에 대한 getter 및 setter
    public String getPersonLocation() {
        return personlocation;
    }

    public void setPersonLocation(String personlocation) {
        this.personlocation = personlocation;
    }
}

