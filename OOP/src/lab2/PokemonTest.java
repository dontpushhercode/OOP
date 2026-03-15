package lab2;
import java.util.HashSet;
//p:1 part:c
public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pikachu1 = new Pokemon("Pikachu", 100, 10);
		Pokemon pikachu2 = new Pokemon("Pikachu", 100, 10);
		
		FirePokemon charmander = new FirePokemon("Charmander", 60, 30, 5);
		FirePokemon charizard = new FirePokemon("Charizard", 90, 40, 2);
		
		HashSet<Pokemon> pokeball = new HashSet<Pokemon>();
		pokeball.add(pikachu1);
		pokeball.add(pikachu2);
		
		System.out.println(pokeball.size()); //1
		System.out.println(pikachu1.equals(pikachu2)); //true
		
		pokeball.add(charmander);
		
		System.out.println(pokeball.size()); //2
		System.out.println(charizard.equals(charmander)); //false		
	}

}
