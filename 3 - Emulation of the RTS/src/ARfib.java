import java.util.Stack;

class ARfib extends AR
{
	int n; // parameter
	int t1; // temporary var to store the value of fib(n-1)
	int t2; // temporary value of fib(n-2)
	int returnVal;
	static int count = 0;
	static RuntimeStack<ARfib> RuntimeStack = new RuntimeStack<ARfib>();
	
	public String toString() {
		return "ARfib" + " n = " + n + " t1 = " + t1 + " t2 = " + t2 + " returnVal = " + returnVal;
	}
	
	void fib()
	{	
		count++;
		
		if (n <= 1) {
			returnVal = n;
			RuntimeStack.DisplayFib();
		}
		
		if (n > 1) {
			ARfib newARfib = new ARfib();
			
			newARfib.n = n - 1;
			RuntimeStack.push(newARfib);
			newARfib.fib(); // call fib(n-1)
			t1 = newARfib.returnVal; // set to equal to fib(n-1)
			
			newARfib.n = n - 2;
			RuntimeStack.push(newARfib);
			newARfib.fib();
			t2 = newARfib.returnVal;
			//RuntimeStack.pop();
					
			returnVal = t1 + t2; // fib(n) = fib(n-1) + fib(n-2)
			
		}
		

	}


}