package genericScheduler;

public abstract class Event {
	public String title;

	public Event(String title) {
		this.title = title;
	}

	public boolean isRelevant(MyDate theDate) {
		return false;
	}	
}
