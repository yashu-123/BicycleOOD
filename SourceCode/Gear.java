package learnOOD;

public class Gear {
	private int chainring = 40;
	private int cog = 18;
	private Wheel wheel = null;

	public Gear(HashMap<String, Object> args) {
		if(args.containsKey("chainring")) {
			this.chainring = (int) args.get("chainring");	
		}
		if(args.containsKey("cog")) {
			this.cog = (int) args.get("cog");	
		}
		if(args.containsKey("wheel")) {	
			this.wheel = (Wheel) args.get("wheel");
		}
	}

	// public Gear(int chainring, int cog, Wheel wheel) {
	// 	this.chainring = chainring;
	// 	this.cog = cog;
	// 	this.wheel = wheel;
	// }

	public double getRatio() {
		return (1.0 * getChainring() / getCog());
	}

	public getDiameter() {
		return wheel.getDiameter();
	}

	public double getGearInches() {
		return getRatio() * getDiameter();
	}

	public int getCog() {
		return cog;
	}

	public int getChainring() {
		return chainring;
	}

	public Wheel getWheel() {
		return wheel;
	}
}

// class Test {
// 	public static void main(String[] args) {
// 		Gear gear1 = new Gear(52, 11);
// 		System.out.println(gear1.getRatio());
// 	}
// }