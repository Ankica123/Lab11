import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieApp {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		List<Movie> movies = new ArrayList<Movie>();

		showMovies(movies);

		Set<String> categories = new TreeSet<>();

		for (Movie m : movies) {
			categories.add(m.getCategory());
		}

//		for(String cat : categories) {
//		System.out.println(cat);
//		}


		Scanner scan = new Scanner(System.in);

		String userChoice = "y";

		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are 10 movies in this list");
		do {

			System.out.println("What category are you interested in?");

			String input = scan.nextLine();

			for (String category : categories) {

				if (input.equalsIgnoreCase(category)) {

					for (Movie m : movies) {

						if (m.getCategory().equalsIgnoreCase(input)) {

							System.out.println(m.getTitle());

						}
					}
				}
			}
			System.out.println();
			System.out.println("Continue? (y/n)");

			userChoice = scan.nextLine();

		} while (userChoice.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");

	}

	private static void showMovies(List<Movie> movies) {

		movies.add(new Movie("Star Wars", "scifi"));
		movies.add(new Movie("2001: A Space Odyssey", "scifi"));
		movies.add(new Movie("E.T The Extra-terrestrial", "scifi"));
		movies.add(new Movie("A Clockwork Orange", "scifi"));
		movies.add(new Movie("Close Encounters of the Third Kind", "scifi"));
		movies.add(new Movie("Tootsie", "comedy"));
		movies.add(new Movie("Duck Soup", "comedy"));
		movies.add(new Movie("The Silence Of The Lambs", "horror"));
		movies.add(new Movie("An American In Paris", "drama"));
		movies.add(new Movie("The Gold Rush", "drama"));
	}
}
