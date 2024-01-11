package TravelSystem;

import lombok.Getter;

public abstract class CountryInfo { // 추상 클래스
    @Getter
    private String countryName;
    private String continent;
    private int population;
    private String language;

    public CountryInfo(String countryName, String continent, int population, String language) { // 생성자
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.language = language;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }
}
