package com.predined.supplier;


interface MySupplier {
	
	public String getName ();
}

// public int randomNo();

class SupplierDemo implements MySupplier{

	@Override
	public String getName() {
		
		return "Ajay";
	}
	
	
}
public class SupplierTredDemo {
	
	public static void main(String[] args) {
		
		SupplierDemo supplierDemo=new SupplierDemo();
		System.out.println(supplierDemo.getName());
		
	}

}
