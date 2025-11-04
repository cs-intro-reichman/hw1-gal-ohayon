// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int firstnumber = Integer.parseInt(args[0]);
		int hundreds=firstnumber/100;
		int tens= (firstnumber / 10) % 10;
		int ones =(firstnumber%10);
		System.out.println(hundreds+ " hundreds, "+ tens + " tens, and "+ ones +" ones.");


		
	}
}
