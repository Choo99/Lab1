package exercise7;

public class Exercise7 {

		private double marsGravity = 0.38;
		static private double earthGravity = 1.0;
		static private double weightOnEarth;
		
		public double getMarsGravity() {
			return marsGravity;
		}
		public void setMarsGravity(double marsGravity) {
			this.marsGravity = marsGravity;
		}
		public double getEarthGravity() {
			return earthGravity;
		}
		public void setEarthGravity(double earthGravity) {
			this.earthGravity = earthGravity;
		}
		public double getWeightOnEarth() {
			return weightOnEarth;
		}
		public void setWeightOnEarth(double massOnEarth) {
			this.weightOnEarth = massOnEarth;
		}
		
		public double calculateWeightOnMars(double weightOnEarth) {
			double weightOnMars = weightOnEarth * this.marsGravity;
			return weightOnMars;
		}
		
		
	
}
