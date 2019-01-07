import java.io.PrintWriter;

class AR_BST_test extends AR
{
	BST<PC> pcBST;
	static MyLinkedList List = new MyLinkedList();
	static RuntimeStack<AR> Stack = new RuntimeStack<AR>();

	void traverse()
	{

	}

	void BST_test()
	{
		pcBST = new EmptyBST<PC>();
		//Construct pcBST of the following PC objects as per previous projects:
		String data;

		ARinsert insertion = new ARinsert();
		insertion.target = pcBST;
		List = insertion.List;
	
		Smartphone IDcode1 = new Smartphone("s001");
		Stack.push(insertion);
		insertion.c = IDcode1;
		insertion.insert();
		pcBST = insertion.target;
		
		
		ARinsert insertion2 = new ARinsert();
		insertion2.target = pcBST;
		List = insertion2.List;
		
		Laptop IDcode2 = new Laptop("l001");
		Stack.push(insertion2);	
		insertion2.c = IDcode2;
		insertion2.insert();
		pcBST = insertion2.target;
		
		
		ARinsert insertion3 = new ARinsert();
		insertion3.target = pcBST;
		List = insertion3.List;
		
		Desktop IDcode3 = new Desktop("d001");
		Stack.push(insertion3);
		insertion3.c = IDcode3;
		insertion3.insert();
		pcBST = insertion3.target;
		
		
		ARinsert insertion4 = new ARinsert();
		insertion4.target = pcBST;
		List = insertion4.List;
		
		Smartphone IDcode4 = new Smartphone("s002");
		Stack.push(insertion4);
		insertion4.c = IDcode4;
		insertion4.insert();
		pcBST = insertion4.target;
		
		
		ARinsert insertion5 = new ARinsert();
		insertion5.target = pcBST;
		List = insertion5.List;
		
		Laptop IDcode5 = new Laptop("l002");
		Stack.push(insertion5);
		insertion5.c = IDcode5;
		insertion5.insert();
		pcBST = insertion5.target;
		
		
		ARinsert insertion6 = new ARinsert();
		insertion6.target = pcBST;
		List = insertion6.List;
		
		Desktop IDcode6 = new Desktop("d002");
		Stack.push(insertion6);
		insertion6.c = IDcode6;
		insertion6.insert();
		pcBST = insertion6.target;
		

		
		ARinsert insertion7 = new ARinsert();
		insertion7.target = pcBST;
		List = insertion7.List;
		
		Smartphone IDcode7 = new Smartphone("s003");
		Stack.push(insertion7);
		insertion7.c = IDcode7;
		insertion7.insert();
		pcBST = insertion7.target;

		
		ARinsert insertion8 = new ARinsert();
		insertion8.target = pcBST;
		List = insertion8.List;
		
		Laptop IDcode8 = new Laptop("l003");
		Stack.push(insertion8);
		insertion8.c = IDcode8;
		insertion8.insert();
		pcBST = insertion8.target;

		
		ARinsert insertion9 = new ARinsert();
		insertion9.target = pcBST;
		List = insertion9.List;
		
		Desktop IDcode9 = new Desktop("d003");
		Stack.push(insertion9);
		insertion9.c = IDcode9;
		insertion9.insert();
		pcBST = insertion9.target;

		
		ARinsert insertion10 = new ARinsert();
		insertion10.target = pcBST;
		List = insertion10.List;
		
		Smartphone IDcode10 = new Smartphone("s004");
		Stack.push(insertion10);
		insertion10.c = IDcode10;
		insertion10.insert();
		pcBST = insertion.target;

		
		ARinsert insertion11 = new ARinsert();
		insertion11.target = pcBST;
		List = insertion11.List;
		
		Laptop IDcode11 = new Laptop("l004");
		Stack.push(insertion11);
		insertion11.c = IDcode11;
		insertion11.insert();
		pcBST = insertion11.target;

		
		ARinsert insertion12 = new ARinsert();
		insertion12.target = pcBST;
		List = insertion12.List;
		
		Desktop IDcode12 = new Desktop("d004");
		Stack.push(insertion12);
		insertion12.c = IDcode12;
		insertion12.insert();
		pcBST = insertion12.target;
		
		data = insertion.value;
		
		GC.setTree(pcBST);
		GC.setStack(Stack);	
		GC.List = List;
		GC.gc(); // invoke GC emulation

		
		ARdelete delete = new ARdelete();
		Stack.push(delete);
		delete.target = pcBST;
		delete.ID = "s001";
		delete.rootData = data;
		List = delete.List;
		delete.delete();
		
		
		ARdelete delete2 = new ARdelete();
		Stack.push(delete2);
		delete2.target = pcBST;
		delete2.ID = "l001";
		delete2.rootData = data;
		List = delete2.List;
		delete2.delete();
		
		ARdelete delete3 = new ARdelete();
		Stack.push(delete3);
		delete3.target = pcBST;
		delete3.ID = "d001";
		delete3.rootData = data;
		List = delete3.List;
		delete3.delete();
		
		GC.setTree(pcBST);
		GC.setStack(Stack);
		GC.gc(); // invoke GC emulation

		
		ARdelete delete4 = new ARdelete();
		Stack.push(delete4);
		delete4.target = pcBST;
		delete4.ID = "s002";
		delete4.rootData = data;
		List = delete4.List;
		delete4.delete();
		
		ARdelete delete5 = new ARdelete();
		Stack.push(delete5);
		delete5.target = pcBST;
		delete5.ID = "l002";
		delete5.rootData = data;
		List = delete5.List;
		delete5.delete();
		
		ARdelete delete6 = new ARdelete();
		Stack.push(delete6);
		delete6.target = pcBST;
		delete6.ID = "d002";
		delete6.rootData = data;
		List = delete6.List;
		delete6.delete();
		
		GC.setTree(pcBST);
		GC.setStack(Stack);
		GC.gc(); // invoke GC emulation
	}
} 