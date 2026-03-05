package Promises;

class Pokemon
{
	String type;
	
	Pokemon(String type)
	{
		this.type = type;
	}
}

public class OopsReturningObjects {

	static Pokemon createPokemon() {
		Pokemon p1 = new Pokemon("Fire");
		return p1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p = createPokemon();
		System.out.println("the pokemon is "+p.type+" type");
	}

}
