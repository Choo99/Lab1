package exercise7;

public class Exercise7Controller {

	public double calculateWeightOnMars(double weightOnEarth) {
		Exercise7 convert = new Exercise7();
		double weightOnMars = weightOnEarth * convert.getMarsGravity();
		return weightOnMars;
	}
	
}
