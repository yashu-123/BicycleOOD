package learnOOD;

public class Wheel {
	private double rimDiameter;
	private double tireDiameter;

	public Wheel(double rimDiameter, double tireDiameter) {
		this.rimDiameter = rimDiameter;
		this.tireDiameter = tireDiameter;
	}

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