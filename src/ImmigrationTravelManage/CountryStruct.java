package ImmigrationTravelManage;

public class CountryStruct {
    //필드선언
    String countryName; //나라이름
    int populaTion; //인구수
    String capital; //수도
    String continent; // 대륙

    public CountryStruct(String countryName, int populaTion, String capital, String continent){
        this.countryName=countryName;
        this.populaTion=populaTion;
        this.capital=capital;
        this.continent=continent;
    }



}
