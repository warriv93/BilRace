
	package p2; 
	
	import javax.swing.JOptionPane;
	
	
	public class Exercise2b {
		public void demo() {
			String message1, message2;
			int hour, minute, second;
			Time dt = new Time();
			
			hour = dt.getHour();
			minute = dt.getMinute();
			second = dt.getSecond();
			message1 = "Klockan �r " + minute + " minuter �ver " + hour + " (+" + second + " sekunder)";
			message2 = dt.toString();
			JOptionPane.showMessageDialog(null, message1);
			JOptionPane.showMessageDialog(null, message2);
			dt.update();
			message2 = dt.toString();
			JOptionPane.showMessageDialog(null, message2);
		}
		public static void main(String[] args) {
			Exercise2b prog = new Exercise2b();
			prog.demo();
		}
	}

