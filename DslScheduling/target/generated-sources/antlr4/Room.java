
public class Room {
	private int roomNo;
	private int capacity;
	private String[] facilities;
	
	public Room() {
		this.roomNo = 0;
		this.capacity = 0;
		this.facilities = new String[0];
	}
	
	public Room(int roomNo_, int capacity_, String[] facilities_) {
		this.roomNo = roomNo_;
		this.capacity = capacity_;
		this.facilities = new String[facilities_.length];
		for (int i = 0; i < facilities_.length; i++) {
			this.facilities[i] = facilities_[i];
		}
	}
	
	public void setRoomNo(int roomNo_) {
		this.roomNo = roomNo_;
	}
	
	public int getRoomNo() {
		return this.roomNo;
	}
	
	public void setCapacity(int capacity_) {
		this.capacity = capacity_;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void setFacilities(String[] facilities_) {
		this.facilities = new String[facilities_.length];
		for (int i=0; i < facilities_.length;i++) {
			facilities[i] = facilities_[i];
		}
	}
	
	public String[] getFacilities() {
		return this.facilities;
	}

}
