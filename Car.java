public class Car {
	
public static void main(String[] args) {
		
	}
	
	//Attributes
	int location;
	int gear = 1;
	int speed = 0;
	final int DESTINATION = 250;
	int time;
	
	//Methods

	void reverseGear(){
		gear = -1;
	}
	
	void gearUp(){
		if (gear == 6){
		System.out.println("Error: Car cannot increase gear anymore");
		}else if (gear == -1){
			gear = 1;
		}else{
			gear = gear + 1;
		}
	}

	void gearDown(){
		if (gear == -1){
			System.out.println("ERROR: Car is in reverse gear, cannot decrease gear");
		}else if (gear == 1){
			System.out.println("ERROR: Cannot decrease gear");
		}else{
			gear = gear - 1;
		}
		
	}
	int reportGear(){
		return gear;
	}
	int reportLocation(){
		return location;
	}
	int reportRemaining(){
		int y = DESTINATION - location;
		return y;
	}
	void moveByTime(int time){
	if (time < 0){
		System.out.println("Time should be positive");
	}else{
		speed = gear * 20;
		int delta = speed * time;
		location = location + delta;
	}
		}
	boolean isArrived(){
		if (location >= DESTINATION){
			return true;
		}
		else {
			return false;
		}
	}
	
}


	
	