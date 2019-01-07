import java.util.Stack;

class ARfactOrFib extends AR
{

	static int n; // parameter
	static int t; // temporary var to store the value of fib(n-1)
	static int returnVal;
	static int countFact = 0;
	static int countFib = 0;
	static int TotalCount = 0;
	static RuntimeStack<ARfactOrFib> RuntimeStack = new RuntimeStack<ARfactOrFib>();
	
	void factOrFib()
	{
		TotalCount++;
		ARmixFactFib newARmixFactFib = new ARmixFactFib();
		
		if ((n % 2) == 0) {
			ARfact newFact = new ARfact();
			newFact.n = n;
			newFact.fact();
			t = newFact.returnVal;
			returnVal = newFact.returnVal;
			newFact.RuntimeStack.push(newFact);
			countFact = newFact.count;
			TotalCount = countFact + countFib;
			//display.DisplaymixFactFib(RuntimeStack);
		}
		
		if ((n % 2) != 0) {
			ARfib newfib = new ARfib();
			newfib.n = n;
			newfib.fib();
			t = newfib.returnVal;
			returnVal = newfib.returnVal;
			newfib.RuntimeStack.push(newfib);
			countFact = newfib.count;
			TotalCount = countFact + countFib;
			//display.DisplaymixFactFib(RuntimeStack);
		}
		
		RuntimeStack.DisplaymixFactFib();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ARfactOrFib" + " n = " + n + " t = " + t + " returnVal = " + returnVal;
	}
}
