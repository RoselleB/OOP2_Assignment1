package sait.mms.manager;
// displayMenu: Displays the main menu to the user.
// addMovie: Prompts the user to add a movie.
// generateMovieListInYear: Displays movies released in a specific year.
// generateRandomMovieList: Generates and displays a random selection of movies.
import java.util.Scanner;

public class MovieManager {
	public int displayMenu(Scanner sc) {
		System.out.println("Movie Management system\n");
		System.out.println("1     Add New Movie and Save\n");
		System.out.println("2     Generate List of Movies Released in a Year\n");
		System.out.println("3     Generate List of Random Movies\n");
		System.out.println("4     Exit\n");
		System.out.print("Enter an option: ");

        return sc.nextInt();
    }
	
	public void addMovie(Scanner sc) {
		System.out.println("Enter duration: ");
		int duration = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter movie title: ");
		String title = sc.nextLine();
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		movies.add(new Movie(duration, title, year));
		System.out.println("Saving movie...");
		
		
	}
	
	public void generateMovieListInYear(Scanner sc) {
		System.out.print("Enter year: ");
		int year = sc.nextInt();

		for (Movie m : movies) {
			if (m.getYear() == year) {
				System.out.println(m);
			}
		}
	}
	public void generateRandomMovieList(Scanner sc) {
	    System.out.print("Enter number of random movies: ");
	    int count = sc.nextInt();

	    Random rand = new Random();

	    for (int i = 0; i < count; i++) {
	        int randIndex = rand.nextInt(movies.size());
	        Movie randomMovie = movies.get(randIndex);
	        System.out.println(randomMovie);
	    }
	}
}
	
