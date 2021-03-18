package excercise8;

import java.util.ArrayList;

import excercise7.Excercise7;

public class Excercise8 {

	public static void main(String[] args) {
		
		Excercise7 convert = new Excercise7();
		ArrayList<Double> weightOnMars = new ArrayList<Double>();
		
		for(double weight = 50;weight < 150; weight+=10)
		{
			weightOnMars.add(convert.calculateWeightOnMars(weight));
		}
		
		int weightOnEarth = 50;
		System.out.println("Earth \tMars");
		for(double currentWeightOnMars:weightOnMars)
		{
			System.out.print(weightOnEarth + "\t"+currentWeightOnMars + "\n");
			weightOnEarth+=10;
			
		}
	}
	
}
