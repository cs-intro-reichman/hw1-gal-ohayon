// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args) {
		int startsum = Integer.parseInt(args[0]);
        double ribit = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
		double cost = startsum * Math.pow(1 + ribit / 100.0, years);

		System.out.println("After " + years + " years, $" + startsum +" saved at " + ribit + "% will yield $" + (int)cost);	
		
	}
}    
		
		