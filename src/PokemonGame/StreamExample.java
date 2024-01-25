package PokemonGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//List 부분에서 진화안된포켓몬 필터링(NOT사용)

public class StreamExample {
    public static void main(String[] args){
        List<PokemonStruct> pokemonList = Arrays.asList(
                new PokemonStruct("Pikachu", 50, "백만볼트", 20),
                new PokemonStruct("Kkobugi", 60 ,"물대포", 15),
                new PokemonStruct("Purin", 100, "노래부르기", 0));

        //filter연산으로 푸린만 필터링
        List<PokemonStruct>onlyPurin = pokemonList.stream()
                .filter(pokemonStruct -> "Purin".equals(pokemonStruct.getMonsterName()))
                .collect(Collectors.toList());

        //출력
        System.out.println("푸린에 대한 필터링 결과: ");
        onlyPurin.forEach(System.out::println);
    }
}

