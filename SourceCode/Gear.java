package learnOOD;

public class Gear {
	private int chainring;
	private int cog;

	public Gear(int chainring, int cog) {
		this.chainring = chainring;
		this.cog = cog;
	}

	public double getRatio() {
		return (1.0 * getChainring() / getCog());
	}

	public int getCog() {
		return cog;
	}

	public int getChainring() {
		return chainring;
	} 
}

// class Test {
// 	public static void main(String[] args) {
// 		Gear gear1 = new Gear(52, 11);
// 		System.out.println(gear1.getRatio());
// 	}
// }