public abstract class MainBST
{
	public static void main(String argv[])
	{
		// argv[0]: output file

		Output.setOutput( argv[0] );
		
		EmptyBST<PC> BST = new EmptyBST<PC>();
		
		Smartphone IDcode1 = new Smartphone("s001");
		Laptop     IDcode2 = new Laptop("l001");
		Desktop    IDcode3 = new Desktop("d001");
		Smartphone IDcode4 = new Smartphone("s002");
		Laptop     IDcode5 = new Laptop("l002");
		Desktop    IDcode6 = new Desktop("d002");
		Smartphone IDcode7 = new Smartphone("s003");
		Laptop     IDcode8 = new Laptop("l003");
		Desktop    IDcode9 = new Desktop("d003");
		Smartphone IDcode10 = new Smartphone("s004");
		Laptop     IDcode11 = new Laptop("l004");
		Desktop    IDcode12 = new Desktop("d004");		
		
		ARinsert newInsert = new ARinsert();
		
		newInsert.target = BST;
		newInsert.c = IDcode1;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode2;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode3;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode4;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode5;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode6;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode7;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode8;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode9;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode10;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode11;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		newInsert.target = BST;
		newInsert.c = IDcode12;
		//System.out.println(newInsert.c);
		newInsert.insert();
		
		ARsearch newsearch = new ARsearch();
		newsearch.count = newInsert.count;
		
		newsearch.target = BST;
		newsearch.ID = "s004";
		newsearch.search();
		
		newsearch.target = BST;
		newsearch.ID = "l004";
		newsearch.search();
		
		newsearch.target = BST;
		newsearch.ID = "d004";
		newsearch.search();
				
		ARdelete newdelete = new ARdelete();
		newdelete.count = newsearch.count;
		
		newdelete.target = BST;
		newdelete.ID = "s001";
		newdelete.delete();
		
		newdelete.target = BST;
		newdelete.ID = "l001";
		newdelete.delete();
		
		newdelete.target = BST;
		newdelete.ID = "d001";
		newdelete.delete();

		Output.closeOutput();
	}
} 
