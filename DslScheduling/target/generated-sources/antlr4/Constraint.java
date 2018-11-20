
public class Constraint {
	private String lecturerName;
	private TimeDetail[] lecturerAvailability;
	
	//konstruktor
	public Constraint() {
		this.lecturerName = "";
		this.lecturerAvailability = new TimeDetail[0];
	}
	
	public Constraint(String lecturerName_, TimeDetail[] time_) {
		this.lecturerName = lecturerName_;
		this.lecturerAvailability = new TimeDetail[time_.length];
		for (int i=0; i<time_.length; i++) {
			lecturerAvailability[i] = time_[i];
		}
		
	}
	
	//setter dan getter
	
	public void setLecturerName(String lecturerName_) {
		this.lecturerName = lecturerName_;
	}
	
	public void setLecturerAvailability(TimeDetail[] time_) {
		this.lecturerAvailability = new TimeDetail[time_.length];
		for (int i=0; i<time_.length; i++) {
			lecturerAvailability[i] = time_[i];
		}
	}
	
	public String getLecturerName() {
		return this.lecturerName;
	}
	
	public TimeDetail[] getTimeDetail() {
		return this.lecturerAvailability;
	}
}
