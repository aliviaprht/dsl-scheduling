import java.util.Arrays;

public class test {
	Room[] rooms;
	Lecture[] lectures;
	Preference[] preferences;
	Constraint[] constraints;
	Schedule[] schedules;
	
	public int getPreferenceIndex(String codeClass) {
		int i;
		
		if (preferences.length > 0) {
			i = 0;
			while ((codeClass != preferences[i].getCodeClass()) && (i<preferences.length)) {
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
	
	public int getConstaintIndex(String lecturerName) {
		int i;
		
		if (constraints.length > 0) {
			i = 0;
			while ((lecturerName != constraints[i].getLecturerName()) && (i<constraints.length)) {
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
	
	public int getRoomsIndex(int capacity, String[] required, int startIdx) {
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
	
	public int countAvailableLecture() {
		int count = 0;
		
		for(int i = 0; i<lectures.length; i++) {
			if (lectures[i].getAvailability()) {
				count++;
			}
		}
		
		return count;
	}
	
	public int[] getIndexAvailableLecture() {
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
	
	public TimeDetail getTimeIntersec(TimeDetail timeA,TimeDetail timeB, int duration) {
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
			}
		}
		
		return time_intersec;
	}
	
	public TimeDetail[] copyArrayOfTimeDetail(TimeDetail[] arrayInput) {
		TimeDetail[] arrayOutput = new TimeDetail[arrayInput.length];
		for (int i=0; i<arrayInput.length; i++) {
			arrayOutput[i] = arrayInput[i];
		}
		
		return arrayOutput;
	}
	
	
	public void  main(String[] args) {
		
		//Array of Room
		String[] facilities = new String[3];
		facilities[0] = "board";
		facilities[1] = "screen";
		facilities[2] = "projector";
		
		Room[] rooms = new Room[2];
		rooms[0] = new Room(7606,100,facilities);
		
		String[] facilities2 = new String[1];
		facilities2[0] = "board";
		
		rooms[1] = new Room(7609,80,facilities2);
		
		//Array of Lecture
		Lecture[] lectures = new Lecture[2];
		
		String[] require = new String[3];
		require[0] = "board";
		require[1] = "screen";
		require[2] = "projector";
		
		lectures[0] = new Lecture("IF4150",45,2,require,true,"Adi Mulyanto");
		
		
		String[] require2 = new String[1];
		require2[0] = "board";
		
		lectures[1] = new Lecture("IF2450",90,1,require2,true,"Yudistira");
		
		
		//Array of Preference
		Preference[] preferences = new Preference[1];
		
		TimeDetail[] jadwal = new TimeDetail[2];
		jadwal[0] = new TimeDetail(1,8,10);
		jadwal[1] = new TimeDetail(3,16,18);
	
		preferences[0] = new Preference("IF4150", jadwal); 
		
		//Array of Contraint
		Constraint[] constraints = new Constraint[2];
		
		TimeDetail[] jadwal2 = new TimeDetail[2];
		jadwal2[0] = new TimeDetail(1,7,11);
		jadwal2[1] = new TimeDetail(3,14,18);
		
		constraints[0] = new Constraint("IF4150", jadwal2);
		
		TimeDetail[] jadwal3 = new TimeDetail[1];
		jadwal3[0] = new TimeDetail(2,7,10);
		
		constraints[1]  = new Constraint("IF2450", jadwal3);
		
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
			
			//Trace Room
		      int startIndexRoom = -1;
		      if (getRoomsIndex(capacity,required,startIndexRoom) != -1) {
		    	  int index_room = getRoomsIndex(capacity,required,startIndexRoom);
		      }
					
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
			if (getConstaintIndex(lecturerName) != -1) {
				int index_constraint = getConstaintIndex(lecturerName);
				time_constraint = new TimeDetail[constraints[index_constraint].getTimeDetail().length];
				time_constraint = Arrays.copyOf(constraints[index_constraint].getTimeDetail(), constraints[index_constraint].getTimeDetail().length);
			} else {
				time_constraint = new TimeDetail[0];
			}
			
			boolean foundSchedule = false;
		    int i_cons = 0;
		    int i_pref = 0;
		    i_pref = time_preference.length;
			while (i_pref < time_preference.length) {
		        while (i_cons < time_constraint.length) {
		          TimeDetail time_intersec = getTimeIntersec(time_preference[0],time_constraint[0],duration);
		        }
		      }
			
			
		}
		
	}
	
}