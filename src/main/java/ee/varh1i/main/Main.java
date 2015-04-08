package ee.varh1i.main;

import ee.varh1i.main.creational.builder.MovieBuilder;
import ee.varh1i.main.model.Movie;


public class Main {

	public static void main(String[] args) {
		
		MovieBuilder movieBuilder = new MovieBuilder();
		Movie movie = movieBuilder.makeComedyMovie();
		System.out.println("Comedy");
		movie.showItems();
		System.out.println("Total cost: " + movie.getCost());
		
		movie = movieBuilder.makeFunnyMovie();
		System.out.println("\n\nFunny");
		movie.showItems();
		System.out.println("Total cost: " + movie.getCost());
		
	}

}
