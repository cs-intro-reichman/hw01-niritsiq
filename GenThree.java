/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int x,y,z,min;
		x=(int)(Math.random()*((Math.max(a,b)-Math.min(a,b)))+Math.min(a,b));
		y=(int)(Math.random()*((Math.max(a,b)-Math.min(a,b)))+Math.min(a,b));
		z=(int)(Math.random()*((Math.max(a,b)-Math.min(a,b)))+Math.min(a,b));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		min=Math.min(Math.min(x,y),z);
		
		System.out.println("the minimal generated number was " +min);
	}
}
