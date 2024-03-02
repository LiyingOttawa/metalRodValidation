/*
* Assessment: Assignment 02
* Student Name: Liying Guo
* Due Date: Jul 28, 2023
* Description: MetalRod Class for Assignment 02
* Professor Name: Amal Ibrahim
*/
public class MetalRod {
	//declare two constant and a field variable
	private static final double EPSILON = 0.002;
	private static final double TARGET_LENGTH = 5.55;
	private double length;
	
	//create a constructor
	public MetalRod() {
		
	}
	//getter and setter
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//work method which is to determine the result by comparing 0.002 and the difference between length and target
	public boolean rodIsWithinTolerance() {
		boolean result;
		result=Math.abs(length-TARGET_LENGTH)<=EPSILON;
		return result;
	}
}
