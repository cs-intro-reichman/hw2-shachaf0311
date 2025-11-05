// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mod = args[1];
		if (mod.equals("v"))
		{
			int c = 1;
			while(c<n+1)
			{
				int seed = c;
				int steps = 1;
				System.out.print(seed + " ");
				while(seed!=1 || steps==1)
				{
					if (seed%2==0)
					{
						seed = seed/2;
						System.out.print(seed + " ");
					}
					else
					{
						seed = (3*seed)+1;
						System.out.print(seed + " ");
					}
					steps = steps + 1;
				}
				System.out.print("(" + steps + ")");
				System.out.println();
				c = c + 1;
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else
		{
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
