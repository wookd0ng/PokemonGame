package PokemonGame;

import java.util.List;

public class PokemonTrainer {
    private String name;
    private PokemonStruct[] pokemonCaptured;
    private List<PokemonStruct>capturedPokemonList;

    public PokemonTrainer(String name, PokemonStruct[] pokemonCaptured) {
        this.name = name;
        this.pokemonCaptured = pokemonCaptured;
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    //개선방법1. 각각의 타입을 enum을 허용햏서 쉽게 순회
    //enum도 순

    public PokemonTrainer(List<PokemonStruct> capturedPokemonList) {
        this.capturedPokemonList = capturedPokemonList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonStruct[] getPokemonCaptured() {
        return pokemonCaptured;
    }

//    public void setPokemonCaptured(PokemonStruct[] pokemonCaptured) {
//        this.pokemonCaptured = pokemonCaptured;
//    }

    public void captureNewPokemon(PokemonStruct newPokemon) {
        //PokemonStruct[]으로도 문제를 해결해야 한다.

        //System.out.println(pokemonCaptured.length); 현재 길이 정보로는 해결하기 어려웠다.
        //배열에서 초기화하지 않은 위치 -> 참조 자료형의 경우 null, 기본 자료형의 경우 해당 자료형의 부정표현(0,0,0,false)
        int count=0; //인덱스로 위치 파악하기
        for(PokemonStruct pokemonSlot : pokemonCaptured){
            if(pokemonSlot==null){
                pokemonCaptured[count] = newPokemon; //count번지에 newPokemon을 넣으면 되겠다.
                System.out.println(newPokemon.getNickName()+"을 "+count+"번지에 담았습니다");
                return;
            }
            count++;
        }
        System.out.println(newPokemon.getNickName()+"을 담을 공간이 없습니다");
    }
    //List<> or ArrayList<>

}
