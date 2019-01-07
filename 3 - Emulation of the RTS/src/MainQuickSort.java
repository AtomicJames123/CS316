import java.util.Stack;

public abstract class MainQuickSort
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );
		
		Stack<ARquickSort> MainRuntimeStack = new Stack<ARquickSort>();
		int A[] = {8, 3, 5, 1, 9, 7, 4, 6, 2, 10};

		ARquickSort newARSort = new ARquickSort();
		newARSort.Atemp = A;
		newARSort.p = 0;
		newARSort.r = 9;
		MainRuntimeStack.push(newARSort);
		newARSort.quickSort(); 
		//System.out.println(newARSort.toString());
		Output.displayln(newARSort.toString());
		MainRuntimeStack.pop();
		
				
		Output.closeOutput();
	}
} 