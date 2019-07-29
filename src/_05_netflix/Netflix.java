package _05_netflix;

public class Netflix {
	public static void main(String[] args) {
		Movie SecretLifeOfPets2 = new Movie("Secret Life of Pets 2", 4);
		Movie RalphBreaksTheInternet = new Movie("Ralph Breaks the Internet", 5);
		Movie Spiderman = new Movie("Spiderman", 0);
		Movie Tangled = new Movie("Tangled", 5);
		Movie Frozen = new Movie("Frozen", 5);

		System.out.println(SecretLifeOfPets2.getTitle() + " " + SecretLifeOfPets2.getTicketPrice());

	}
}
