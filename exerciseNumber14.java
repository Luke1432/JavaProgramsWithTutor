package exercises;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class exerciseNumber14{
public static void main(String[] args){
	
	SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd: HH:mm:ss.SSS");
	cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
	System.out.println("Now: "+cdt.format(System.currentTimeMillis()));

}
}
