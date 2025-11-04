

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int lim = Integer.parseInt(args[0]);
		int number1 =(int)(Math.random()*lim)+1;
		int number2 =(int)(Math.random()*lim)+1;
		int number3 =(int)(Math.random()*lim)+1;
		int biggest = Math.max(number1, Math.max(number2, number3));
		int smallest = Math.min(number1, Math.min(number2, number3));
		int mid= (number1+number2+number3)-(biggest+smallest);
		System.out.println(number1+" "+ number2+ " "+ number3 );
		System.out.println(smallest+" "+mid+" "+biggest);
	
		}
}
