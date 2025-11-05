// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int run_limit = Integer.parseInt(args[0]);
		double pi = Math.PI;
		int divider = 3;
		int count = 0;
		double new_pi4 = 1.0;
		while(count<run_limit)
		{
			if (count%2==0)
			{
				new_pi4 = new_pi4 - (1/(double)divider);
			}
			else
			{
				new_pi4 = new_pi4 + (1/(double)divider);
			}
			divider = divider + 2;
			count++;
		}
		double new_pi = new_pi4 * 4;
		System.out.println("pi according to java: " + pi);
		System.out.println("pi, approximated:     " + new_pi);
	}
}
