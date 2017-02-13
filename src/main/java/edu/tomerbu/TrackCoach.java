package edu.tomerbu;

public class TrackCoach implements Coach {


	public TrackCoach() {
		
	}

 	public String getDailyWorkout() {
		return "Run a hard 5k";
	}


	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");		
	}
}










