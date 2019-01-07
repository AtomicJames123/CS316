import java.util.Stack;

public abstract class MainMixFactFib
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );

		Stack<ARmixFactFib> MainRuntimeStack = new Stack<ARmixFactFib>();
		

		ARmixFactFib newARmixFactFib = new ARmixFactFib ();
		newARmixFactFib.n = 10;
		MainRuntimeStack.push(newARmixFactFib);
		newARmixFactFib.mixFactFib(); // call fact(5)
		Output.displayln(newARmixFactFib.toString());
		MainRuntimeStack.pop();

		Output.closeOutput();
	}
} 