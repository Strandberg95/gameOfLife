package projekt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class OutWriter {
	
	Calendar cal = Calendar.getInstance();
	
	public void write(String input){
		String date = "";
		
		date = cal.get(Calendar.YEAR) + "-" +  (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH);
		
		try {
			FileWriter fw = new FileWriter("/Users/Strandberg95/Desktop/mofo/Calendar " + date );
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(input);
			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
