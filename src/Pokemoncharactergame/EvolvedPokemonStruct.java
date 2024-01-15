package Pokemoncharactergame;

public class EvolvedPokemonStruct extends PokemonStruct{  // is a 관계를 밝혀준다.
    private String skill2Name;
    private int skill2Dmg;

    public EvolvedPokemonStruct(String monsterName, int maxHp,
                                String skill1Name, int skill1Dmg,
                                String skill2Name, int skill2Dmg) {
        // 원래 있었던 부모를 지칭하는 키워드 super 로 코드 재사용이 가능해졌다.
        super(monsterName, maxHp, skill1Name, skill1Dmg);
        this.skill2Name = skill2Name;
        this.skill2Dmg = skill2Dmg;
    }

    public EvolvedPokemonStruct(String monsterName, String nickName, int maxHp,
                                String skill1Name, int skill1Dmg,
                                String skill2Name, int skill2Dmg) {
        // 원래 있었던 부모를 지칭하는 키워드 super 로 코드 재사용이 가능해졌다.
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg);
        this.skill2Name = skill2Name;
        this.skill2Dmg = skill2Dmg;
    }


    //메소드가 받는 매개변수. 진화되기 전의 포켓몬의 정보가 담긴 PokemonStruct 객체
    public EvolvedPokemonStruct pokemonStructEvolve(PokemonStruct beforeEvolution) {
        //beforeEvolution 객체가 가지고 있는 evolve 메소드 호출beforeEvolution 객체를 진화시켜 얻은 새로운 포켓몬 정보를 afterEvolution 변수에 할당하는 것입니다.
        EvolvedPokemonStruct afterEvolution = beforeEvolution.evolve();
        return afterEvolution;
        //메소드를 호출한 곳으로 반환이 됨.(pokemonStructEvolve를 호출한 곳으로 반환)
    }

    @Override
    public String toString() {
        String beforeEvolutionInfo = super.toString();
        return "EvolvedPokemonStruct{" + beforeEvolutionInfo +
                ", skill2Name='" + skill2Name + '\'' +
                ", skill2Dmg=" + skill2Dmg +
                "}";
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public void setSkill2Name(String skill2Name) {
        this.skill2Name = skill2Name;
    }

    public int getSkill2Dmg() {
        return skill2Dmg;
    }

    public void setSkill2Dmg(int skill2Dmg) {
        this.skill2Dmg = skill2Dmg;
    }
}
