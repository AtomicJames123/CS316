import java.util.Stack;

class ARquickSort extends AR
{
	static int Atemp[];
	static int ptemp;
	static int rtemp;
	static int returnVal;
	static int count = 0;
	static RuntimeStack<ARquickSort> RuntimeStack = new RuntimeStack<ARquickSort>();
	static StringBuilder array = new StringBuilder();
	int q;
	int p;
	int r;
	
	void quickSort()
	{
		count++;
		
		array = new StringBuilder();
		array.append("[");
		
		for (int i = 0; i < Atemp.length; i++) {
			array.append(Atemp[i]);
			if (i < Atemp.length - 1) {
				array.append(",");
			}
		}
		
		array.append("]");
		
		ARquickSort newSort1 = new ARquickSort();
		ARquickSort newSort2 = new ARquickSort();
		ARpartition newPart = new ARpartition();
	
		if (p < r) {
			
			RuntimeStack.push(newSort1);
			RuntimeStack.push(newSort2);
			
			newPart.Atemp = Atemp;
			newPart.p = p;
			newPart.r = r;
			newPart.SortCount = count;
			
			newPart.partition();
			q = newPart.returnVal;
			
			ptemp = p;
			rtemp = r;
			
			newSort1.Atemp = newPart.Atemp;
			newSort1.p = p;
			newSort1.r = q-1;
			newSort1.quickSort();
			
			newSort2.Atemp = newPart.Atemp;
			newSort2.p = q+1;
			newSort2.r = r;
			newSort2.quickSort();
			
		}
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "ARquickSort" + " " + "p = " + ptemp + " " + "r = " + rtemp + " " + "A = " + array; 
	}
}





