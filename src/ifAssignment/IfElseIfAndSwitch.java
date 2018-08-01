package ifAssignment;

public class IfElseIfAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Genesis";
		String findName = "Sherefedin Getahun";
		int currentYear = 2018;
		//name = "";
		if(name != "") {
			System.out.println("I have found name called: " + name);
		}
		else {
			System.out.println("Sorry I couldn't find name. :(");
		}
		
		if(findName == "") {
			System.out.println("Sorry no name found :( ");
		}
		else if(findName == "Sherefedin Getahun") {
			System.out.println("Yes! I found " + findName);
		}
		
		switch(currentYear) {
			case 2017:
				System.out.println("No not current year :(");
			break;
			case 2018:
				System.out.println("Yes it is current year and it is : " + currentYear + " :)");
			break;
			default:
				break;
		}
		
	}

}
