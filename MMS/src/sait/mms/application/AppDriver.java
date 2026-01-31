package sait.mms.application;

import java.util.Scanner;
import sait.mms.manager.MovieManager;

public class AppDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieManager manager = new MovieManager();
		
		manager.loadMovieList();
			
		boolean running = true;
			
		while (running) {
			int option = manager.displayMenu(sc);
			
			switch (option) {
				case 1:
					manager.addMovie(sc);
					break;
				case 2:
					manager.generateMovieListInYear(sc);
					break;
				case 3:
					manager.generateRandomMovieList(sc);
					break;
				case 4: manager.saveMovieListToFile();
					running = false;
					break;
				default:
					System.out.println("Invalid option!");
				}
			}
		sc.close();
	}

}