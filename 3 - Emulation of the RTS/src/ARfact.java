import java.util.Stack;

class ARfact extends AR
{
	int n; // parameter
	int t; // temporary var to store the value of fact(n-1)
	int returnVal;
	static int count = 0;
	static RuntimeStack<ARfact> RuntimeStack = new RuntimeStack<ARfact>();

	public String toString()
	{
		return "ARfact" + " n = " + n + " t = " + t + " returnVal = " + returnVal;
	}

	void fact()
	{
		count++;
		
		if ( n <= 1 )
		{
			returnVal = 1;
			RuntimeStack.DisplayFact();
		}
		
		else
		{
			ARfact newARfact = new ARfact();
			RuntimeStack.push(newARfact);
			newARfact.n = n - 1; // pass parameter value
			newARfact.fact(); // call fact(n-1)
			t = newARfact.returnVal; // pass return value of fact(n-1) to t
			returnVal = (n) * (t); // store the value of fact(n) = n*fact(n-1)
		}
	}
}