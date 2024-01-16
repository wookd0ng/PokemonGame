package PokemonProject;

import Pokemoncharactergame.PokemonStruct;

public class PokemonLuncher {
    public static void main(String [] args){
        System.out.println("포켓몬 게임 시작");
        PokemonStruct pikachu = new PokemonStruct("피카츄",100,"백만볼트",20);
        PokemonStruct kobugi = new PokemonStruct("꼬부기",100,"물대포",20);
        PokemonStruct pairi = new PokemonStruct("파이리",100,"불대포",20);
        System.out.println(PokemonStruct.pokeDex.get("pikachu"));
    }
}
