package p2;

public class Painting {
	//variablar skapas
	private String title, painter;
	private int year;
	
	public Painting (String inTitle, String inPainter, int inYear){
		//kompilatorn importerar instansvariablarnas v�rde.
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
		//skriver ut v�rdena i variablerna title, painter o year o �ver�tter till en str�ng i konsolen.
		return title+ " av " +painter+ ", " +year;
				  
	}	
	
}
