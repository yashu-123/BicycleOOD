package learnOOD;

public class Wheel {
	private double rimDiameter;
	private double tireDiameter;

	public Gear(HashMap<String, Object> args) {
		if(args.containsKey("rimDiameter")) {
			this.rimDiameter = (double) args.get("rimDiameter");
		}
		if(args.containsKey("tireDiameter")) {
			this.tireDiameter = (double) args.get("tireDiameter");	
		}
	}

	// public Wheel(double rimDiameter, double tireDiameter) {
	// 	this.rimDiameter = rimDiameter;
	// 	this.tireDiameter = tireDiameter;
	// }

	public double getRimDiameter() {
		return rimDiameter;
	}

	public double getTireDiameter() {
		return tireDiameter;
	}

	public double getDiameter() {
		return getRimDiameter() + 2 * getTireDiameter();
	}

	public double getCircumference() {
		return Math.PI * getDiameter();
	}

}