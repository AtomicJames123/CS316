import java.util.Stack;

class ARgcd extends AR
{
	int returnVal;
	int xTemp;
	int yTemp;
	static int x;
	static int y;
	static int count = 0;
	static RuntimeStack<ARgcd> RuntimeStack = new RuntimeStack<ARgcd>();
	
	void greatestCommonDivisor()
	{
		xTemp = x;
		yTemp = y;
		
		count++;
		
		if (x == y) {
			returnVal = x;
			RuntimeStack.DisplayGCD();
		}
		
		else if (x < y) {
			ARgcd newARgcd = new ARgcd();
			RuntimeStack.push(newARgcd);
			newARgcd.x = x;
			newARgcd.y = y - x;
			greatestCommonDivisor();
			
		}
		
		else {
			ARgcd newARgcd = new ARgcd();
			RuntimeStack.push(newARgcd);
			newARgcd.x = x - y;
			newARgcd.y = y;
			greatestCommonDivisor();
			
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ARgcd" + " x = " + xTemp + " y = " + yTemp + " returnVal = " + returnVal;
	}
}
