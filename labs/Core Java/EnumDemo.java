package Day5;

public class EnumDemo {

	public enum WeekDays{MONDAY{
		public String getName() {
			return "Monday";
		}
	},
		TUESDAY{
		public String getName() {
		return "Tuesday";
	}
},
		WEDNESDAY{
	public String getName() {
		return "Wednesday";
	}
},

		THURSDAY{
	public String getName() {
		return "Thursday";
	}
},
		FRIDAY{
	public String getName() {
		return "Friday";
	}
},
		SATURDAY{
	public String getName() {
		return "Saturday";
	}
},
		SUNDAY{
	public String getName() {
		return "Sunday";
	}
};

public abstract String getName();
	};
	
	public static void main(String args[]) {
		String test="monday";
		int ctr=0;
		/*if(WeekDays.Monday.toString()==test) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}*/
		
		for(Object O:WeekDays.values()) {
			if(O.toString()==test) {
				System.out.println("True");
				break;
			}
			else {
				ctr++;
			}
		}
		System.out.println("Count:"+ctr);
		System.out.println(WeekDays.MONDAY.getName());
	}
}

