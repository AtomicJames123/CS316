import java.io.*;

public abstract class Output
{
	public static PrintWriter outStream;

	public static void display(String s)
	{
		outStream.print(s);
	}
	
	public static void objdisplay(Object obj)
	{
		outStream.print(obj);
	}

	public static void displayln(String s)
	{
		outStream.println(s);
	}
	
	public static void objdisplayln(Object obj)
	{
		outStream.println(obj);
	}

	public static void setOutput(String outFile)

	// Sets the output stream to "outFile".

	{
		try
		{
			outStream = new PrintWriter( new FileOutputStream(outFile) );
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public static void closeOutput()
	{
		outStream.close();
	}
	
	public static void DisplayList(MyLinkedList List, MyLinkedList OutputList, String Outfile) {
		//outStream = new PrintWriter( new FileOutputStream(Outfile) );
		List.CreateOutputList(outStream, OutputList);
	}
	
	

}  
