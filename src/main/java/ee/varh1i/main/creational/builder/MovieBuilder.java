package ee.varh1i.main.creational.builder;

import ee.varh1i.main.model.ComedyMovie;
import ee.varh1i.main.model.FunnyVideo;
import ee.varh1i.main.model.JazzMusic;
import ee.varh1i.main.model.Movie;
import ee.varh1i.main.model.PopMusic;

public class MovieBuilder {
	
	public Movie makeFunnyMovie(){
		Movie movie = new Movie();
		movie.addItem(new FunnyVideo());
		movie.addItem(new JazzMusic());
		return movie;
	}	
	
	public Movie makeComedyMovie(){
		Movie movie = new Movie();
		movie.addItem(new ComedyMovie());
		movie.addItem(new PopMusic());
		return movie;
	}
	
}
