package pk3;
/*
 * Fredrik Larsson
 */
public class Painting {
	private String title;
	private String painter;
	private int year;
	
	//s�tter v�rderna.
	public Painting (String title, String painter, int year){
	this.title = title; 
	this.painter = painter;
	this.year = year; 

	}
	//Skickar tillbaka v�rderna.
	public String getTitle(){
	  return this.title;
			  }
	public String getPainter(){
	  return this.painter;
	  }
	public int getYear(){
	  return this.year;
	  }
	//Skickar tillbaka en tostring.
	public String toString(){
    return this.title +" av " +this.painter +", "+ this.year ; 
	


	}
}