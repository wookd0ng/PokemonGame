package PokemonProject;

import Pokemoncharactergame.EvolvedPokemonStruct;

import java.util.HashMap;
import java.util.Map;

import static Pokemoncharactergame.PokemonStruct.pokeDex;

public abstract class PokemonStruct {
    public static final Map<String, PokemonStruct> pokedex = new HashMap<String, PokemonStruct>();

    static {
        pokedex.put("pikachu", new PokemonStruct("피카츄", nickName, 100, "백만볼트", 20));
        pokedex.put("kkobugi", new PokemonStruct("꼬부기", nickName, 100, "물대포", 20));
        pokedex.put("pairi", new PokemonStruct("파이리", nickName, 100, "불대포", 20));
    }

    public static final Map<String, Integer> pokeEvolveDex = new HashMap<>();

    static {
        pokeEvolveDex.put("kkobugi", 50);
        pokeEvolveDex.put("pairi", 50);
        // Add more evolution mappings as needed
    }

    private String name;
    private int maxHp;
    private String skill1Name;
    private int skill1Dmg;

    public PokemonStruct(String name, String nickName, int maxHp, String skill1Name, int skill1Dmg) {
        this.name = name;
        this.maxHp = maxHp;
        this.skill1Name = skill1Name;
        this.skill1Dmg = skill1Dmg;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public String getSkill1Name() {
        return skill1Name;
    }

    public int getSkill1Dmg() {
        return skill1Dmg;
    }

    public EvolvedPokemonStruct evolve() {
        // 진화 전 : 진화 후  // key-value 쌍으로 된 데이터

        String newMonsterName = String.valueOf(pokeEvolveDex.containsKey(this.name.toLowerCase()) ? pokeEvolveDex.get(this.name.toLowerCase()) : null);
        EvolvedPokemonStruct targetEvolveResult; // 진화 후 포켓몬의 정보를 담을 변수 선언

        if (newMonsterName != null && pokeDex.containsKey(newMonsterName)) { // Check if the evolved Pokemon exists in pokeDex
            if (pokeDex.get(newMonsterName) instanceof EvolvedPokemonStruct) {
                targetEvolveResult = (EvolvedPokemonStruct) pokeDex.get(newMonsterName);
                return targetEvolveResult; // Return the evolved Pokemon's information
            }
        }

        return null;  // Return null if the evolution fails or if the evolved Pokemon is not an instance of EvolvedPokemonStruct
    }

    public abstract void surf();
}
