
public class Preference {
	private String codeClass;
	private TimeDetail[] time;
	
	//konstruktor
	public Preference() {
		this.codeClass = "";
		this.time = new TimeDetail[0];
	}
	
	public Preference(String codeClass_, TimeDetail[] time_) {
		this.codeClass = codeClass_;
		this.time = new TimeDetail[time_.length];
		for (int i=0; i<time_.length; i++) {
			time[i] = time_[i];
		}
	}
	
	//setter dan getter
	
	public void setCodeClass(String codeClass_) {
		this.codeClass = codeClass_;
	}
	
	public void setTime(TimeDetail[] time_) {
		this.time = new TimeDetail[time_.length];
		for (int i=0; i<time_.length; i++) {
			time[i] = time_[i];
		}
	}
	
	public String getCodeClass() {
		return this.codeClass;
	}
	
	public TimeDetail[] getTimeDetail() {
		return this.time;
	}
	

}
