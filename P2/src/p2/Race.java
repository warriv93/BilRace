package p2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.awt.Font;

import javax.swing.ImageIcon;

public class Race {
//	privata variablar skapas 
	private PaintWindow window;
	private Car car1, car2;
	
	
	public Race(PaintWindow window, Car car1, Car car2) { 
		//kompilatorn importerar instansvariablarnas v�rde.
		this.window = window;
		this.car1 = car1;
		this.car2 = car2;
		
	
	}
	public void action(){
		
		
		Random rand = new Random();
		
		//startv�rde f�r bilarna
		int car1X=520, car2X=520; 
		
		//rektangeln skapas o bakgrundsf�rgen kommer fram.
		int maxX = window.getBackgroundWidth(); 
		int maxY = window.getBackgroundHeight();
		window.fillRect(0, 0, maxX, maxY, Color.green);
		
//		ImageIcon ii = new ImageIcon("G:/downloads/DA211TP2HT13/background.jpg");
//		window.showImage(ii, 0, 0);

		//linjerna f�r v�g, startlinje etc skapas
		//x1, y1, x2, y2, color, width
		window.line(20, 250, 580, 250, Color.GRAY, 200); 
		window.line(20, 250, 580, 250, Color.WHITE, 5);
		window.line(500, 130, 500, 370, Color.BLACK, 5);
		window.line(40, 130, 40, 370, Color.RED, 5);
		
		
		// f�rs�k till att 
//		int bg = window.getY();
//		int y1 = 370;
//		while ( bg <= 130){
//			window.line(40, 370, 40, 370, Color.BLACK, 5);
//			y1 -= 40;
//			bg--;
//		}
		
		
		
		//anger start v�rdet p� x
		car1.moveTo(520, 270);
		car2.moveTo(520, 200);
		
		window.showImage(car1.getImage(), car1.getX(), car1.getY());
		window.showImage(car2.getImage(), car2.getX(), car2.getY());
		
		
//		start ljus skapas genom att l�gga in window objekt i olika f�rger med pause i mellan
		window.line(220, 50, 380, 50, Color.BLACK, 80);
		window.fillOval(180, 10, 80, 80, Color.red);
		PaintWindow.pause(800);
		window.fillOval(260, 10, 80, 80, Color.yellow);
		PaintWindow.pause(800);
		window.fillOval(340, 10, 80, 80, Color.green);
		
		
		//SOUND OF HELL!
				AudioClip clip = null; 
				try { 
					URL url = new File("G:/downloads/DA211TP2HT13/race.wav").toURI().toURL(); 
					clip = Applet.newAudioClip(url); 
					
				} catch (MalformedURLException e) {}
		

		        clip.play();
		        
		        
		//H�r b�rjar loopen
		while (car1.getX() > 40 && car2.getX() > 40){
			// int q = 0; q += 5: Det �r tilldelningen
			
			
			//bilderna p� bilarna f�rflyttas enligt det nya randomv�rdet nedan.
			car1.moveTo(car1X, car1.getY());
			car2.moveTo(car2X, car2.getY());
			
			//bilderna p� bilarna plaseras ut p� anget startv�rde
			window.showImage(car1.getImage(), car1.getX(), car1.getY());
			window.showImage(car2.getImage(), car2.getX(), car2.getY());
			
			//bilarna f�r ett nytt randomv�rde
			car1X += rand.nextInt( 10 ) - 10;
			car2X += rand.nextInt( 10 ) - 10;
			
			//sl�ar ner s� man hinner se hur bilarna f�rflyttar sig.
			PaintWindow.pause(30);	
		
		
		}
		
        clip.stop();
		// if car win show winner 
	if (car1.getX() <= 40){
		Font f = new Font("Monospaced",Font.PLAIN,40);
		Text text = new Text("Bl� Bil vann!", f,Color.black, Color.blue);
		window.showImage(text, 150, 110);
	
	}if (car2.getX() <= 40){
		Font f = new Font("Monospaced",Font.PLAIN,40);
		Text text = new Text("R�d Bil vann!", f,Color.black, Color.red);
		window.showImage(text, 150, 110);
	
	}
	
	}
	
	
}

