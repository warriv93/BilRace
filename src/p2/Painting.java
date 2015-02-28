package p2;

public class Painting {
	private String title, painter;
	private int year;
	
	public Painting (String inTitle, String inPainter, int inYear){
		this.title = inTitle;
		this.painter = inPainter;
		this.year = inYear;
		
	}
	
	public String getTitle(){
		return this.title;
		
	}

	public String getPainter() {
		return painter;
	}

	public int getYear() {
		return year;
	}
	
	public String toString(){
		return title+ " av " +painter+ ", " +year;
				  
	}	
	
}
