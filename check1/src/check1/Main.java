package check1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date_s = "2011-01-18"; 
		try {
		String oldstring = "2011-01-18";
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring);
		System.out.print(date);
	  } catch(ParseException e){
          System.out.println(e.getMessage());
      }
	}

}
