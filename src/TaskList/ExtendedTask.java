package TaskList;
import java.sql.Timestamp;

public class ExtendedTask extends Task{

	public enum Period{DAILY,WEEKLY,MONTHLY,YEARLY}
	private Period period = Period.WEEKLY;
	
	public ExtendedTask(String description, Timestamp duedate) {
		super(description, duedate);
	}
	
	public ExtendedTask(String description, Timestamp duedate, Period period){
		super(description, duedate);
		this.setPeriod(period);
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
	
	@Override
	public String toString(){
		return getDuedate() + " | " + getStatus() + " | " + getPeriod() + " | Note: " + getDescription();
	}
	
	
}
