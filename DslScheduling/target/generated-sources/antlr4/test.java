import java.util.Arrays;

public class test {
	static Room[] rooms = new Room[0];
	static Lecture[] lectures = new Lecture[0];
	static Preference[] preferences = new Preference[0];
	static Constraint[] constraints = new Constraint[0];
	static Schedule[] schedules = new Schedule[0];
	
	public static int getPreferenceIndex(String codeClass) {
		int i;
		
		if (preferences.length > 0) {
			i = 0;
			while ((i<preferences.length) && (codeClass != preferences[i].getCodeClass())) {
				i++;
			}
			
			if (i == preferences.length) {
				return -1;
			} else {
				return i;
			}
			
		} else {
			return -1;
		}
	}
	
	public static int getConstraintIndex(String lecturerName) {
		int i;
		
		if (constraints.length > 0) {
			i = 0;
			while ((i<constraints.length) && (lecturerName != constraints[i].getLecturerName())) {
				i++;
			}
			
			if (i == constraints.length) {
				return -1;
			} else {
				return i;
			}
			
		} else {
			return -1;
		}
	}
	
	public static int getRoomsIndex(int capacity, String[] required, int startIdx) {
		int i;
		boolean found = false;
		
		if (rooms.length > startIdx +1) {
			i = startIdx + 1;
			while (!found && (i < rooms.length)) {
				if (capacity > rooms[i].getCapacity()) {
					i++;
				} else {
					if (Arrays.asList(rooms[i].getFacilities()).containsAll(Arrays.asList(required))) {
						found = true;
					} else {
						i++;
					}
				}
			}
			
			if (i == rooms.length) {
				return -1;
			} else {
				return i;
			}
			
		} else {
			return -1;
		}
	}
	
	public static int countAvailableLecture() {
		int count = 0;
		
		for(int i = 0; i<lectures.length; i++) {
			if (lectures[i].getAvailability()) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] getIndexAvailableLecture() {
		int[] index = new int[countAvailableLecture()];
		int j = 0;
		
		for (int i = 0; i<lectures.length; i++) {
			if (lectures[i].getAvailability()) {
				index[j] = i;
				j++;
			}
		}
		
		return index;
	}
	
	public static TimeDetail getTimeIntersec(TimeDetail timeA,TimeDetail timeB, int duration) {
		TimeDetail time_intersec = new TimeDetail();
		int bigStart = 0;
		int smallEnd = 0;
		
		if (timeA.getDay() == timeB.getDay()) {
			if (timeA.getStartHour() >= timeB.getStartHour()) {
				bigStart = timeA.getStartHour();
			} else {
				bigStart = timeB.getStartHour();
			}
			
			if (timeA.getFinishHour() <= timeB.getFinishHour()) {
				smallEnd = timeA.getFinishHour();
			} else {
				smallEnd = timeB.getFinishHour();
			}
			
			if (smallEnd - bigStart >= duration) {
				time_intersec.setDay(timeA.getDay());
				time_intersec.setStartHour(bigStart);
				time_intersec.setFinishHour(smallEnd);
			} else {
				
			}
		}
		
		return time_intersec;
	}
	
	public static boolean isTimeOverlap(TimeDetail timeA, TimeDetail timeB) {
		boolean isOverlap = false;
		
		if (timeA.getDay() == timeB.getDay()) {
			TimeDetail time_intersec = new TimeDetail();
			time_intersec = getTimeIntersec(timeA,timeB,1);
			if (time_intersec.getDay() == 0) {
				isOverlap = true;
			}
		}
		
		
		return isOverlap;
	}
	
	public static boolean isValidSchedule(int room, TimeDetail time, int index_schedule) {
		boolean isValid = true;
		int i = 0;
		
		if (index_schedule == 0) {
			isValid = true;
		} else {
			while(isValid && i < index_schedule) {
				if (schedules[i].getRoomNo() == room) {
					if (isTimeOverlap(schedules[i].getTime(),time)) {
						isValid = false;
					} else {
						i++;
					}
				} else {
					i++; 
				}
			}
		}
		
		return isValid;
	}
	
	
	public static void main(String[] args) {
		
		//Array of Room
		String[] facilities = new String[3];
		facilities[0] = "board";
		facilities[1] = "screen";
		facilities[2] = "projector";
		
		rooms = new Room[2];
		rooms[0] = new Room(7606,100,facilities);
		
		String[] facilities2 = new String[1];
		facilities2[0] = "board";
		
		rooms[1] = new Room(7609,80,facilities2);
		
		//Array of Lecture
		lectures = new Lecture[2];
		
		String[] require = new String[3];
		require[0] = "board";
		require[1] = "screen";
		require[2] = "projector";
		
		lectures[0] = new Lecture("IF4150",45,2,require,true,"Adi Mulyanto");
		
		
		String[] require2 = new String[1];
		require2[0] = "board";
		
		lectures[1] = new Lecture("IF2450",90,1,require2,true,"Yudistira");
		
		
		//Array of Preference
		preferences = new Preference[1];
		
		TimeDetail[] jadwal = new TimeDetail[2];
		jadwal[0] = new TimeDetail(1,8,10);
		jadwal[1] = new TimeDetail(3,16,18);
	
		preferences[0] = new Preference("IF4150", jadwal); 
		
		//Array of Contraint
		constraints = new Constraint[2];
		
		TimeDetail[] jadwal2 = new TimeDetail[2];
		jadwal2[0] = new TimeDetail(1,7,11);
		jadwal2[1] = new TimeDetail(3,14,18);
		
		constraints[0] = new Constraint("Adi Mulyanto", jadwal2);
		
		TimeDetail[] jadwal3 = new TimeDetail[1];
		jadwal3[0] = new TimeDetail(2,7,10);
		
		constraints[1]  = new Constraint("yudistira", jadwal3);
		
		//Start Scheduling
		Schedule[] schedules = new Schedule[countAvailableLecture()];
		int[] index_available = getIndexAvailableLecture();
		
		for (int i=0; i<countAvailableLecture(); i++) {
			schedules[i] = new Schedule();
			
			//get variable
			String classCode = lectures[index_available[i]].getClassCode();
			String lecturerName = lectures[index_available[i]].getLecturerName();
			int capacity = lectures[index_available[i]].getCapacity();
			int duration = lectures[index_available[i]].getDuration();
			String[] required = lectures[index_available[i]].getRequire();
			
			schedules[i].setCourseName(classCode);
			schedules[i].setLecturer(lecturerName);
					
			//Trace Time
		    TimeDetail[] time_preference;
		    TimeDetail[] time_constraint;
			//check preferences
			if (getPreferenceIndex(classCode) != -1) {
				int index_preference = getPreferenceIndex(classCode);
				time_preference = new TimeDetail[preferences[index_preference].getTimeDetail().length];
				time_preference = Arrays.copyOf(preferences[index_preference].getTimeDetail(), preferences[index_preference].getTimeDetail().length);
			} else {
				time_preference = new TimeDetail[0];
			}
			
			//check constraint
			if (getConstraintIndex(lecturerName) != -1) {
				int index_constraint = getConstraintIndex(lecturerName);
				time_constraint = new TimeDetail[constraints[index_constraint].getTimeDetail().length];
				time_constraint = Arrays.copyOf(constraints[index_constraint].getTimeDetail(), constraints[index_constraint].getTimeDetail().length);
			} else {
				time_constraint = new TimeDetail[0];
			}
			
//			//Trace Room
//		    int startIndexRoom = -1;
//		    if (getRoomsIndex(capacity,required,startIndexRoom) != -1) {
//		    	int index_room = getRoomsIndex(capacity,required,startIndexRoom);
//		    	startIndexRoom = index_room;
//		    }
			
			int i_cons = 0;
		    int i_pref = 0;
		    TimeDetail curr_time = new TimeDetail();
		    int curr_room_idx;
		    if (time_preference.length == 0) {
		    	
		    } else if (time_constraint.length == 0) {
		    	
		    } else {
		    	boolean foundSchedule = false;
		    	while (i_pref < time_preference.length && !foundSchedule) {
		    		while (i_cons < time_constraint.length && !foundSchedule) {
		    			TimeDetail time_intersec = getTimeIntersec(time_preference[i_pref],time_constraint[i_cons],duration);
		    			if (time_intersec.getDay() == 0) {
		    				i_cons++;
		    			} else {
		    				curr_time.setDay(time_intersec.getDay());
		    				curr_time.setStartHour(time_intersec.getStartHour());
		    				curr_time.setFinishHour(time_intersec.getStartHour()+duration);
		    				while (curr_time.getFinishHour() <= time_intersec.getFinishHour() && !foundSchedule) {
		    					//Trace Room
			    			    int startIndexRoom = -1;
			    			    
			    			    while (startIndexRoom + 1 < rooms.length && !foundSchedule) {
			    			    	if (getRoomsIndex(capacity,required,startIndexRoom) != -1) {
			    			    		int index_room = getRoomsIndex(capacity,required,startIndexRoom);
			    			    		startIndexRoom = index_room;
			    			    		if (isValidSchedule(rooms[index_room].getRoomNo(), curr_time, i)) {
			    			    			foundSchedule = true;
			    			    		}
				    			    } else {
				    			    	startIndexRoom = rooms.length;
				    			    }
			    			    }
		    				}
		    			}
			        }
		    		
		    		if (!foundSchedule) {
		    			i_pref++;
		    			i_cons = 0;
		    		}
			    }
		    }
			
			
		}
		
	}
	
}