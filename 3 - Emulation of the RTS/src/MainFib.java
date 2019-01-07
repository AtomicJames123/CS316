import java.util.Stack;

public abstract class MainFib
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );

		RuntimeStack<ARfib> MainRuntimeStack = new RuntimeStack<ARfib>();
		
		ARfib newARfib = new ARfib();
		newARfib.n = 10;
		MainRuntimeStack.push(newARfib);
		newARfib.RuntimeStack.push(newARfib);
		newARfib.fib(); 
		Output.displayln(newARfib.toString());
		MainRuntimeStack.pop();

		Output.closeOutput();
	}
} 
