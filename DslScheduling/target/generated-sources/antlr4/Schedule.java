
public class Schedule {
	private String courseName;
	private String lecturer;
	private int roomNo;
	private TimeDetail time;
	
	public Schedule() {
		this.courseName = "";
		this.lecturer = "";
		this.roomNo = 0;
		this.time = new TimeDetail();
	}
	
	public Schedule(String courseName_, String lecturer, int roomNo_, TimeDetail time_) {
		this.courseName = "";
		this.lecturer = "";
		this.roomNo = 0;
		this.time = new TimeDetail();
	}
	
	public void setCourseName(String courseName_) {
		this.courseName = courseName_;
	}
	
	public void setLecturer(String lecturer_) {
		this.lecturer = lecturer_;
	}
	
	public void setRoomNo(int roomNo_) {
		this.roomNo = roomNo_;
	}
	
	public void setTime(TimeDetail time_) {
		this.time = time_;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getLecturer() {
		return this.lecturer;
	}
	
	public int getRoomNo() {
		return this.roomNo;
	}
	
	public TimeDetail getTime() {
		return this.time;
	}
}
