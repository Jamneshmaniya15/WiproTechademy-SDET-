package Promises;

class Poke
{
	String name;
	int id;
	
	Poke(){
		id =0;
		name = "Pikachu";
	}
	
	Poke(int id){
		this.id = id;
		name = "Frokie";
	}
	
	Poke(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("Name : " +name+ " id : " +id);
	}
	
}

public class OopsConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poke p = new Poke();
		Poke p1 = new Poke(2);
		Poke p2 = new Poke(3,"Charlizard");
		p.display();
		p1.display();
		p2.display();

	}

}
