import java.util.Stack;

public abstract class MainFact
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );
		
		RuntimeStack<ARfact> RuntimeStackMain = new RuntimeStack<ARfact>();

		ARfact newARfact = new ARfact();
		newARfact.n = 10;
		RuntimeStackMain.push(newARfact);
		newARfact.fact(); // call fact(5)
		Output.displayln(newARfact.toString());
		RuntimeStackMain.pop();

		Output.closeOutput();
	}
} 
