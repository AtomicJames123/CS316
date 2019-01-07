import java.lang.*;

public abstract class MainBST
{
	
	public static void main(String argv[])
	{
		// argv[0]: output file

		Output.setOutput( argv[0] ); // set output to testOutput.txt
		
		LinkedList List = new LinkedList();
		
		BST<PC> PC = new EmptyBST<PC>();
		
		//
		Smartphone IDcode1 = new Smartphone(); 
		IDcode1 = new Smartphone(0, "s001", String.valueOf(IDcode1.getClass()), List);
		//IDcode1.IDcode = "s001";
		//IDcode1.objId = 0;
		PC = PC.insert(IDcode1);
		
		//String class1 = String.valueOf(IDcode1.getClass());
		
		//List.SortedInsertion(class1, IDcode1.objId, IDcode1.IDcode);
		
		//
		Laptop IDcode2 = new Laptop();
		IDcode2 = new Laptop(1, "1001", String.valueOf(IDcode2.getClass()),List );
		//IDcode2.IDcode = "1001";
		//IDcode2.objId = 1;
		PC = PC.insert(IDcode2);
		
		//String class2 = String.valueOf(IDcode2.getClass());
		
		//List.SortedInsertion(class2, IDcode2.objId, IDcode2.IDcode );
		
		Desktop	IDcode3 = new Desktop();
		IDcode3 = new Desktop(2, "d001", String.valueOf(IDcode3.getClass()),List); 
		//IDcode3.IDcode = "d001";
		//IDcode3.objId = 2;
		PC = PC.insert(IDcode3);
		
		//String class3 = String.valueOf(IDcode3.getClass());
		
		//List.SortedInsertion(class3, IDcode3.objId, IDcode3.IDcode);
		
		Smartphone IDcode4 = new Smartphone();
		IDcode4 = new Smartphone(3,"s002",String.valueOf(IDcode4.getClass()),List); 
		//IDcode4.IDcode = "s002";
		//IDcode4.objId = 3;
		PC = PC.insert(IDcode4);
		
		//String class4 = String.valueOf(IDcode4.getClass());
		
		//List.SortedInsertion(class4, IDcode4.objId, IDcode4.IDcode);
		
		Laptop	IDcode5 = new Laptop();
		IDcode5 = new Laptop(4,"1002",String.valueOf(IDcode5.getClass()),List); 
		//IDcode5.IDcode = "1002";
		//IDcode5.objId = 4;
		PC = PC.insert(IDcode5);
		
		//String class5 = String.valueOf(IDcode5.getClass());
		
		//List.SortedInsertion(class5, IDcode5.objId, IDcode5.IDcode);
		
		Desktop	IDcode6 = new Desktop();
		IDcode6 = new Desktop(5,"d002",String.valueOf(IDcode5.getClass()),List); 
		//IDcode6.IDcode = "d002";
		//IDcode6.objId = 5;
		PC = PC.insert(IDcode6);
		
		//String class6 = String.valueOf(IDcode5.getClass());
		
		//List.SortedInsertion(class6, IDcode6.objId, IDcode6.IDcode);
		
		Smartphone IDcode7 = new Smartphone();
		IDcode7 = new Smartphone(6,"s003",String.valueOf(IDcode7.getClass()),List); 
		//IDcode7.IDcode = "s003";
		//IDcode7.objId = 6;
		PC = PC.insert(IDcode7);
		
		//String class7 = String.valueOf(IDcode7.getClass());
		
		//List.SortedInsertion(class7, IDcode7.objId, IDcode7.IDcode);
		
		Laptop	IDcode8 = new Laptop();
		IDcode8 = new Laptop(7,"1003",String.valueOf(IDcode8.getClass()),List); 
		//IDcode8.IDcode = "1003";
		//IDcode8.objId = 7;
		PC = PC.insert(IDcode8);
		
		//String class8 = String.valueOf(IDcode8.getClass());
		
		//List.SortedInsertion(class8, IDcode8.objId, IDcode8.IDcode);
		
		Desktop	IDcode9 = new Desktop();
		IDcode9 = new Desktop(8,"d003",String.valueOf(IDcode9.getClass()),List); 
		//IDcode9.IDcode = "d003";
		//IDcode9.objId = 8;
		PC = PC.insert(IDcode9);
		
		//String class9 = String.valueOf(IDcode9.getClass());
		
		//List.SortedInsertion(class9, IDcode9.objId, IDcode9.IDcode);
		
		Smartphone IDcode10 = new Smartphone();
		IDcode10 = new Smartphone(9,"s004",String.valueOf(IDcode7.getClass()),List); 
		//IDcode10.IDcode = "s004";
		//IDcode10.objId = 9;
		PC = PC.insert(IDcode10);
		
		//String class10 = String.valueOf(IDcode7.getClass());
		
		//List.SortedInsertion(class10, IDcode10.objId, IDcode10.IDcode);
		
		Laptop	IDcode11 = new Laptop();
		IDcode11 = new Laptop(10,"1004",String.valueOf(IDcode11.getClass()),List); 
		//IDcode11.IDcode = "1004";
		//IDcode11.objId = 10;
		PC = PC.insert(IDcode11);
		
		//String class11 = String.valueOf(IDcode11.getClass());
		
		//List.SortedInsertion(class11, IDcode11.objId, IDcode11.IDcode);
		
		Desktop	IDcode12 = new Desktop();
		IDcode12 = new Desktop(11,"d004",String.valueOf(IDcode12.getClass()),List);
		//IDcode12.IDcode = "d004";
		//IDcode12.objId = 11;
		PC = PC.insert(IDcode12);
		
		//String class12 = String.valueOf(IDcode12.getClass());
		
		//List.SortedInsertion(class12, IDcode12.objId, IDcode12.IDcode);
		
		
		
		BST<Car> Car = new EmptyBST<Car>();
		
		Sedan IDcode13 = new Sedan();
		IDcode13 = new Sedan(12,"se001",String.valueOf(IDcode13.getClass()),List); 
		//IDcode13.IDcode = "se001";
		//IDcode13.objId = 12;
		Car = Car.insert(IDcode13);
		
		//String class13 = String.valueOf(IDcode13.getClass());
		
		//List.SortedInsertion(class13, IDcode13.objId, IDcode13.IDcode);
		
		Coupe IDcode14 = new Coupe();
		IDcode14 = new Coupe(13,"co001",String.valueOf(IDcode14.getClass()),List); 
		//IDcode14.IDcode = "co001";
		//IDcode14.objId = 13;
		Car = Car.insert(IDcode14);
		
		//String class14 = String.valueOf(IDcode14.getClass());
		
		//List.SortedInsertion(class14, IDcode14.objId, IDcode14.IDcode);
		
		Van	IDcode15 = new Van();
		IDcode15 = new Van(14,"va001",String.valueOf(IDcode15.getClass()),List); 
		//IDcode15.IDcode = "va001";
		//IDcode15.objId = 14;
		Car = Car.insert(IDcode15);
		
		//String class15 = String.valueOf(IDcode15.getClass());
		
		//List.SortedInsertion(class15, IDcode15.objId, IDcode15.IDcode);
		
		Sedan IDcode16 = new Sedan();
		IDcode16 = new Sedan(15,"se002",String.valueOf(IDcode16.getClass()),List); 
		//IDcode16.IDcode = "se002";
		//IDcode16.objId = 15;
		Car = Car.insert(IDcode16);
		
		//String class16 = String.valueOf(IDcode16.getClass());
		
		//List.SortedInsertion(class16, IDcode16.objId, IDcode16.IDcode);
		
		Coupe IDcode17 = new Coupe();
		IDcode17 = new Coupe(16,"co002",String.valueOf(IDcode17.getClass()),List); 
		//IDcode17.IDcode = "co002";
		//IDcode17.objId = 16;
		Car = Car.insert(IDcode17);
		
		//String class17 = String.valueOf(IDcode17.getClass());
		
		//List.SortedInsertion(class17, IDcode17.objId, IDcode17.IDcode);
		
		Van	IDcode18 = new Van();
		IDcode18 = new Van(17,"va002",String.valueOf(IDcode18.getClass()),List); 
		//IDcode18.IDcode = "va002";
		//IDcode18.objId = 17;
		Car = Car.insert(IDcode17);
		
		//String class18 = String.valueOf(IDcode18.getClass());
		
		//List.SortedInsertion(class18, IDcode18.objId, IDcode18.IDcode);
		
		Sedan IDcode19 = new Sedan();
		IDcode19 = new Sedan(18,"se003",String.valueOf(IDcode19.getClass()),List); 
		//IDcode19.IDcode = "se003";
		//IDcode19.objId = 18;
		Car = Car.insert(IDcode19);
		
		//String class19 = String.valueOf(IDcode19.getClass());
		
		//List.SortedInsertion(class19, IDcode19.objId, IDcode19.IDcode);
		
		Coupe IDcode20 = new Coupe();
		IDcode20 = new Coupe(19,"co003",String.valueOf(IDcode20.getClass()),List); 
		//IDcode20.IDcode = "co003";
		//IDcode20.objId = 19;
		Car = Car.insert(IDcode20);
		
		//String class20 = String.valueOf(IDcode20.getClass());
		
		//List.SortedInsertion(class20, IDcode20.objId, IDcode20.IDcode);
		
		Van	IDcode21  = new Van();
		IDcode21 = new Van(20,"va003",String.valueOf(IDcode21.getClass()),List);
		//IDcode21.IDcode = "va003";
		//IDcode21.objId = 20;
		Car = Car.insert(IDcode21);
		
		//String class21 = String.valueOf(IDcode21.getClass());
		
		//List.SortedInsertion(class21, IDcode21.objId, IDcode21.IDcode);
		
		LinkedList OutputList = new LinkedList();
		
		Output.DisplayList(List, OutputList , argv[0]);

		Output.closeOutput();
	}
} 
