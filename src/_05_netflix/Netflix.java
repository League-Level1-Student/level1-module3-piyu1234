package _05_netflix;

public class Netflix {
	public static void main(String[] args) {
		Movie SecretLifeOfPets2 = new Movie("Secret Life of Pets 2", 4);
		Movie RalphBreaksTheInternet = new Movie("Ralph Breaks the Internet", 5);
		Movie Spiderman = new Movie("Spiderman", 0);
		Movie Tangled = new Movie("Tangled", 5);
		Movie Frozen = new Movie("Frozen", 5);
		NetflixQueue Order = new NetflixQueue();
		Order.addMovie(Frozen);
		Order.addMovie(Tangled);
		Order.addMovie(Spiderman);
		Order.addMovie(RalphBreaksTheInternet);
		Order.addMovie(SecretLifeOfPets2);
		Order.printMovies();
		Order.getBestMovie().getTitle();
		System.out.println(" The best Movie is " + Order.getBestMovie().getTitle());
        Order.sortMoviesByRating();
        Order.getMovie(1).getTitle();
        System.out.println(" The second best Movie is " + Order.getMovie(1).getTitle());
		System.out.println(SecretLifeOfPets2.getTitle() + " " + SecretLifeOfPets2.getTicketPrice());

	}
}
