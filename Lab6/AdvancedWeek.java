package Lab6;

public class AdvancedWeek {
	
	private String day_1 = "Monday";
	
	private String day_2 = "Tuesday";
	
	private String day_3 = "Wednesday";
	
	private String day_4 = "Thursday";
	
	private String day_5 = "Friday";
	
	private String day_6 = "Saturday";
	
	private String day_7 = "Sunday";
	int index=1;
	public void advanced() {
	System.out.println( day_1+ ": " + index++ + ",\n" +
	day_2 + ": " + index++ + ",\n" +
	day_3 + ": " + index++ + ",\n" +
	day_4 + ": " + index++ + ",\n" +
	day_5 + ": " + index++ + ",\n" +
	day_6+ ": " + index++ + ",\n" +
	day_7 + ": " + index++ + ".");
	
	}
}

