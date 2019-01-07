import java.util.Stack;

class ARmixFactFib extends AR
{
	
	static int n; // parameter
	static int t1; // temporary var to store the value of fib(n-1)
	static int t2; // temporary value of fib(n-2)
	static int returnVal;
	static int count = 0;
	static RuntimeStack<ARmixFactFib> RuntimeStack = new RuntimeStack<ARmixFactFib>();

	void mixFactFib()
	{
		ARmixFactFib newARmixFactFib = new ARmixFactFib();
		ARfactOrFib newfactorfib = new ARfactOrFib();
		newfactorfib.RuntimeStack.push(newfactorfib);
		RuntimeStack.push(newARmixFactFib);
		
		newfactorfib.TotalCount++;
		
		newfactorfib.n = n;
		newfactorfib.factOrFib(); // call fib(n-1)
		t1 = newfactorfib.t; 
		
		newfactorfib.n = n - 1;
		newfactorfib.factOrFib(); // call fib(n-1)
		t2 = newfactorfib.t; 
		
		returnVal = t1 + t2;
		
	}
	

	public String toString() {
		// TODO Auto-generated method stub
		return "ARmixFactFib" + " n = " + n + " t1 = " + t1 + " t2 = " + t2 + " returnVal = " + returnVal;
	}
}
