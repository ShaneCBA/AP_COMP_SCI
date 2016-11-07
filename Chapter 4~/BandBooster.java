public class BandBooster {
	private String name;
	private Integer boxesSold;

	public BandBooster(String newName) {
		this.name=newName;
		boxesSold=0;
	}

	public String getName() {
		return name;
	}

	public void updateSales(int addBoxes) {
		boxesSold += addBoxes;
	}

	public String toString() {
		return name+":\t"+boxesSold.toString()+" Boxes";
	}
}