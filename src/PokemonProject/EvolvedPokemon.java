package PokemonProject;

public class EvolvedPokemon extends PokemonStruct{
    int skill2Dmg;
    public EvolvedPokemon(String name, int maxHp, String skill1Name, int skill1Dmg){
        super(name, nickName, maxHp, skill1Name, skill1Dmg);
        this.skill2Dmg=skill2Dmg;
    }

    public int getSkill2Dmg() {
        return skill2Dmg;
    }
}
