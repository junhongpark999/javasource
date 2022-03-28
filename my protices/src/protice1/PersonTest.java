package protice1;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신",175.2f,75.2f);

		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		System.out.println(personLee.weight);
		System.out.println(personKim.weight);
	}


	}


