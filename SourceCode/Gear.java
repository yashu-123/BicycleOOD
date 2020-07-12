package learnOOD;

class Gear {
	private int chainring;
	private int cog;
	private Wheel wheel;

	public Gear(int chainring, int cog, Wheel wheel) {
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	public double getRatio() {
		return (1.0 * getChainring() / getCog());
	}

	public double getGearInches() {
		return getRatio() * wheel.getDiameter();
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