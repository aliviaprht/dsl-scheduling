
public class Lecture {
	private String classCode;
	private int capacity;
	private int duration;
	private String[] require;
	private boolean available;
	private String lecturerName;
	
	//konstruktor
	
	public Lecture() {
		this.capacity = 0;
		this.duration = 0;
		this.require = new String[0];
		this.classCode = "";
		this.available = false;
		this.lecturerName = "";
	}
	
	public Lecture(String classCode_, int capacity_, int duration_, String[] require_, boolean available_, String lecturerName_) {
		int i;
		this.require = new String[require_.length];
		this.capacity = capacity_;
		this.duration = duration_;
		for (i=0; i < require_.length; i++) {
			require[i] = require_[i];
		}
		this.classCode = classCode_;
		this.available = available_;
		this.lecturerName = lecturerName_;
	}
	
	//setter dan getter
	
	public void setCapacity(int capacity_) {
		this.capacity = capacity_;
	}
	
	public void setDuration(int duration_) {
		this.duration = duration_;
	}
	
	public void setRequire(String[] require_) {
		int i;
		this.require = new String[require_.length];
		for (i=0; i < require_.length; i++) {
			require[i] = require_[i];
		}
	}
	
	public void setClassCode(String classCode_) {
		this.classCode = classCode_;
	}
	
	public void setAvailability(boolean available_) {
		this.available = available_;
	}
	
	public void setLecturerName(String lecturerName_) {
		this.lecturerName = lecturerName_;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public String[] getRequire() {
		return this.require;
	}
	
	public String getClassCode() {
		return this.classCode;
	}
	
	public boolean getAvailability() {
		return this.available;
	}
	
	public String getLecturerName() {
		return this.lecturerName;
	}

}
