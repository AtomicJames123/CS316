import java.util.Stack;

class ARpartition extends AR
{
	static int returnVal;
	static int count = 0;
	static RuntimeStack<ARpartition> RuntimeStack = new RuntimeStack<ARpartition>();
	static StringBuilder array = new StringBuilder();
	static int Atemp[];
	static int x;
	static int i;
	static int temp;
	static int j;
	int p;
	int r;
	
	void partition()
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
		
		ARpartition newPart = new ARpartition();
		ARquickSort newSort = new ARquickSort();
		
		RuntimeStack.push(newPart);
		
		x = Atemp[r];
		i = p-1;
		for ( j = p; j <= r-1; j++ )
			if ( Atemp[j] <= x )
			{
				i++;
				temp = Atemp[i];
				Atemp[i] = Atemp[j];
				Atemp[j] = temp;
				
			}
		temp = Atemp[i+1];
		Atemp[i+1] = Atemp[r];
		Atemp[r] = temp;
		
		newSort.Atemp = Atemp;
		
		returnVal = i+1;
		
		RuntimeStack.DisplaySort();
		
	}
			
	public String toString() {
		// TODO Auto-generated method stub
		return "ARpartition" + " " + "A =" + " " + array + " p =" + " " + p + " r =" + " " + r +
				" x =" + " " + x + " i =" + " " + i + " j =" + " " + j + " temp =" + " " + temp + " returnVal =" + " " + returnVal;
	}
}
