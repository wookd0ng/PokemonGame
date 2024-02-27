package PokemonGame;

import java.util.Arrays;

public class PokemonLuncher2 {
    public static void main(String[] args) {
        PokemonStruct myPikachu = new PokemonStruct("Pikachu", "myPikachu", 50, "백만볼트", 20);
        PokemonStruct myKkobugi = new PokemonStruct("Kkobugi", "myKkobugi", 60 ,"물대포", 15);
        PokemonStruct myGugu = new PokemonStruct("Gugu", "myGugu",30, "부리로 쪼기", 10);
        PokemonStruct myKkoret = new PokemonStruct("kkoret", "myKKoret", 40 ,"깨물기", 10);
//
//        System.out.println(myPikachu);
//        System.out.println(myKkobugi);
//        System.out.println(myGugu);
//        System.out.println(myKkoret);
//
//        PokemonStruct dexPikachu = PokemonStruct.pokeDex.get("Pikachu");
//        PokemonStruct dexKkobugi = PokemonStruct.pokeDex.get("Kkobugi");
//        PokemonStruct dexGugu = PokemonStruct.pokeDex.get("Gugu");
//        PokemonStruct dexKkoret = PokemonStruct.pokeDex.get("Kkoret");
//
//        System.out.println(dexPikachu);
//        System.out.println(dexKkobugi);
//        System.out.println(dexGugu);
//        System.out.println(dexKkoret);

        PokemonTrainer jiwoo = new PokemonTrainer("Jiwoo", new PokemonStruct[10]);

//        jiwoo.pokemonCaptured[0] = myPikachu;
//        jiwoo.pokemonCaptured[1] = myKkobugi;
//        jiwoo.pokemonCaptured[2] = myGugu;
//        jiwoo.pokemonCaptured[3] = myKkoret;

        jiwoo.captureNewPokemon(myPikachu);
        System.out.println(Arrays.toString(jiwoo.getPokemonCaptured()));

    }
}
