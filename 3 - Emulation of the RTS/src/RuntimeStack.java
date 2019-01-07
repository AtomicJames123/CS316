import java.util.Stack;

public class RuntimeStack<E> extends Stack<E> {
	
	int maxinsert = 0;
	int maxsearch = 0;
	int maxdelete = 0;
	int maxGCD = 0;
	int maxfib = 0;
	int maxSort = 0;
	Output output;
	
	public RuntimeStack() {
		super();
	}
	
	public void DisplayFact() {
		ARfact newfact = new ARfact();
		
		RuntimeStack<ARfact> RuntimeStack = new RuntimeStack<ARfact>();
		RuntimeStack = newfact.RuntimeStack;
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newfact.count);
		output.displayln("Maximum size of stack so far:" + RuntimeStack.size());
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
	
		while (!(RuntimeStack.isEmpty())) {
			newfact = RuntimeStack.pop();
			output.displayln(newfact.toString());
		}
		
	}
	
	public void DisplayFib() {
		ARfib newfib = new ARfib();
		
		RuntimeStack<ARfib> RuntimeStack = new RuntimeStack<ARfib>();
		RuntimeStack = newfib.RuntimeStack;
		
		if (RuntimeStack.size() > maxfib) {
			maxfib = RuntimeStack.size();
		}

		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newfib.count);
		output.displayln("Maximum size of stack so far:" + maxfib);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
		
		while (!RuntimeStack.isEmpty()) {
			newfib = RuntimeStack.pop();
			output.displayln(newfib.toString());
		}
	}
	
	public void DisplaymixFactFib() {
		ARmixFactFib newmixFactFib = new ARmixFactFib();
		ARfactOrFib newfactOrFib = new ARfactOrFib();
		
		RuntimeStack<ARmixFactFib> RuntimeStackMix = new RuntimeStack<ARmixFactFib>();
		RuntimeStack<ARfactOrFib> RuntimeStackOr = new RuntimeStack<ARfactOrFib>();
		
		RuntimeStackMix = newmixFactFib.RuntimeStack;
		RuntimeStackOr = newfactOrFib.RuntimeStack;
		
		while (!RuntimeStackOr.isEmpty()) {
			newfactOrFib = RuntimeStackOr.pop();
			output.displayln(newfactOrFib.toString());
		}
		
		while (!RuntimeStackMix.isEmpty()) {
			newmixFactFib = RuntimeStackMix.pop();
			output.displayln(newmixFactFib.toString());
		}
	}
	
	public void DisplayInsert() {
		ARinsert newInsert = new ARinsert();
	
		RuntimeStack<ARinsert> RuntimeStack = new RuntimeStack<ARinsert>();
		RuntimeStack = newInsert.RuntimeStack;
		
		if (RuntimeStack.size() > maxinsert) {
			maxinsert = RuntimeStack.size();
		}
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newInsert.count);
		output.displayln("Maximum size of stack so far:" + maxinsert);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
	
		while (!RuntimeStack.isEmpty()) {
			newInsert = RuntimeStack.pop();
			output.displayln(newInsert.toString());
		}
	}
	
	public void DisplaySearch() {
		ARsearch newsearch = new ARsearch();
		
		RuntimeStack<ARsearch> RuntimeStack = new RuntimeStack<ARsearch>();
		RuntimeStack = newsearch.RuntimeStack;
		
		if (RuntimeStack.size() > maxinsert + maxsearch) {
			maxsearch = RuntimeStack.size();
		}
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newsearch.count);
		output.displayln("Maximum size of stack so far:" + maxsearch);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
	
		while (!RuntimeStack.isEmpty()) {
			newsearch = RuntimeStack.pop();
			output.displayln(newsearch.toString());
		}
	}
	
	public void DisplayDelete() {
		ARdelete newdelete = new ARdelete();
		
		RuntimeStack<ARdelete> RuntimeStack = new RuntimeStack<ARdelete>();
		RuntimeStack = newdelete.RuntimeStack;
		
		if (RuntimeStack.size() > maxinsert + maxsearch + maxdelete) {
			maxdelete = RuntimeStack.size();
		}
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newdelete.count);
		output.displayln("Maximum size of stack so far:" + maxdelete);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
	
		while (!RuntimeStack.isEmpty()) {
			newdelete = RuntimeStack.pop();
			output.displayln(newdelete.toString());
		}
		
	}
	
	public void DisplayGCD() {
		ARgcd newGCD = new ARgcd();
		
		RuntimeStack<ARgcd> RuntimeStack = new RuntimeStack<ARgcd>();
		RuntimeStack = newGCD.RuntimeStack;
		
		if (RuntimeStack.size() > maxGCD) {
			maxGCD = RuntimeStack.size();
		}
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + newGCD.count);
		output.displayln("Maximum size of stack so far:" + maxGCD);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
		
		while (!RuntimeStack.isEmpty()) {
			newGCD = RuntimeStack.pop();
			output.displayln(newGCD.toString());
		}
	}
	
	public void DisplaySort() {
		ARpartition newpart = new ARpartition();
		ARquickSort newsort = new ARquickSort();
		int count;
		
		RuntimeStack<ARpartition> RuntimeStack = new RuntimeStack<ARpartition>();
		RuntimeStack<ARquickSort> RuntimeStackSort = new RuntimeStack<ARquickSort>();
		
		RuntimeStack = newpart.RuntimeStack;
		RuntimeStackSort = newsort.RuntimeStack;
		
		
		if (RuntimeStack.size() > maxSort) {
			maxSort = RuntimeStack.size() + RuntimeStackSort.size();
		}
		
		count = newpart.count + newsort.count;
		
		output.displayln("---------------------------");
		output.displayln("Total number of function calls so far:" + count);
		output.displayln("Maximum size of stack so far:" + maxSort);
		
		output.displayln("");
		
		output.displayln("The contents of the runtime stack will be displayed from top to bottom: ");
		
		output.displayln("");
		
		while (!RuntimeStack.isEmpty()) {
			newpart = RuntimeStack.pop();
			output.displayln(newpart.toString());
		}
		
		while (!RuntimeStackSort.isEmpty()) {
			newsort = RuntimeStackSort.pop();
			output.displayln(newsort.toString());
		}
	}
}
