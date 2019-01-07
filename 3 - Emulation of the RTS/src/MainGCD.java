import java.util.Stack;

public abstract class MainGCD
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );

		ARgcd newARgcd = new ARgcd();
		newARgcd.RuntimeStack.push(newARgcd);
		newARgcd.x = 84;
		newARgcd.y = 36;
		newARgcd.greatestCommonDivisor(); // call fact(5)
		

		Output.closeOutput();
	}
} 