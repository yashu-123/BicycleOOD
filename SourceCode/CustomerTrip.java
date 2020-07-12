package learnOODProject;



class Bike {

	public void suitableBike(int date, int route) {
		System.out.println("This is the best suitable Bike for route = " + route + " available on date = " + date );
		//Return Bike ID Best Suitable
	}
}

class Trip {

	public int[] suitableTrip(int date, int difficulty) {
		System.out.println("Got all the trips on date = " + date + " of difficulty = " + difficulty);
		//Return routes-ID that qualify the date and the difficulty level
		int[] arr = { 1, 2, 3, 4, 5}; //Just for Psudeo Code
		return arr;
	}
}

class TripFinder {

	public void suitableTripFind(int date, int difficulty, boolean needBike) {
		
		System.out.println("TripFinder Called : ");
		Trip t =  new Trip();
		int[] routes = t.suitableTrip(date, difficulty); //Get Routes from suitableTrip message
		
		if(needBike == true) {
			System.out.println("For Each Trip : ");
			Bike bike = new Bike();
			for(int i : routes) {  //--> Loop for the Routes returned by tf,suitableTrip(...);

				bike.suitableBike(date, i); //Get bikes from suitableBike method.
			}
		}
	}
}


public class CustomerTrip {
	
	public static void main(String[] args) {
		TripFinder tf = new TripFinder();	
		tf.suitableTripFind( 26, 40, true );
	}
}