
public class TimeDetail {
	int day;
	int startHour;
	int finishHour;
	
	//konstruktor
	
	public TimeDetail() {
		this.day = 0;
		this.startHour = 0;
		this.finishHour = 0;
	}
	
	public TimeDetail(int day_, int startHour_, int finishHour_) {
		this.day = day_;
		this.startHour = startHour_;
		this.finishHour = finishHour_;
	}
	
	//setter dan getter
	public void setDay(int day_) {
		this.day = day_;
	}
	
	public void setStartHour(int startHour_) {
		this.startHour = startHour_;
	}
	
	public void setFinishHour(int finishHour_) {
		this.finishHour = finishHour_;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getStartHour() {
		return this.startHour;
	}
	
	public int getFinishHour() {
		return this.finishHour;
	}
	
}
