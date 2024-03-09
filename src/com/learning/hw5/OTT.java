package com.learning.hw5;

public class OTT {
	
//	String nameM;
//	String nameS;
//	String plot;
//	int minDur;
//	int episodes;
//	String season;
//	
	Movie[] movieAry= new Movie[10];
	int moviePosition = 0;
	
	
	
	
	
	public void movieAdd (String name, String content) {
	this.movieAry[moviePosition] = new Movie(name,content);
	moviePosition++;
	}
	
	public void movieRemove (int position) {
		this.movieAry[moviePosition] = null;
		}
	
	public Movie getMovieByName (String name){
		Movie reqMovie = null;
		
			for (int i=1; i <10; i++) {
			
			if(movieAry[i].name == name) {
				reqMovie = movieAry[i];
				break;
			}
			
	
		} return reqMovie;
	}
	
		public Movie getMoviePosition(int position) {
		
			return this.movieAry[position];
		
					}
	
		public boolean updateMovieName (String oldName, String newName) {
		
			Movie movie = getMovieByName(oldName);
			for (int i=1; i <10; i++) {
				
				if(movieAry[i].name == oldName) {
					movieAry[i].name = newName;
					return true;
				}
				
		
			} return false;
		
	}

		
		 public void playAmovie(String name) {
			 
			 Movie myMovie = getMovieByName(name);
			 
			 if(myMovie != null) {
				 myMovie.play();
			 }

}
}
