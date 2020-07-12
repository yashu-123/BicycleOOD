package learnOOD;

interface Bicycle {
	HashMap<String, String> spares();
} 

class RoadBike implements Bicycle {
	private char size = 'S';
	private String tapeColor = "red";

	RoadBike(HashMap<String, Object> args) {
		if(args.containsKey("size")) {
			this.size = (char) args.get("size");
		}
		if(args.containsKey("tapeColor")) {
			this.tapeColor = (String) args.get("tapeColor");
		}

	}
	
	public HashMap<String, String> spares() {
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("chain", "10-speed");
		mp.put("tireSize", "23");
		mp.put("tapeColor", tapeColor);
	}

}


class MountainBike {
	private char size = 'S';
	private String frontShock = "Manitou";
	private String rearShock = "Fax";

	RoadBike(HashMap<String, Object> args) {
		if(args.containsKey("size")) {
			this.size = (char) args.get("size");
		}
		if(args.containsKey("frontShock")) {
			this.frontShock = (String) args.get("frontShock");
		}
		if(args.containsKey("rearShock")) {
			this.rearShock = (String) args.get("rearShock");
		}
	}

	public HashMap<String, String> spares() {
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("chain", "10-speed");
		mp.put("tireSize", "2.1");
		mp.put("rearShock", rearShock);
	}
}