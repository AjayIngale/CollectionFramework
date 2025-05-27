package gom.predefined;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;

public class DoubleBinaryOpDemo {
	public static void main(String[] args) {
		DoubleBinaryOperator sum=(num1,num2)->num1+num2;
		
		System.out.println(sum.applyAsDouble(10, 20));
		
		DoubleSupplier num=()->12.5;
		System.out.println(num.getAsDouble());
		
	}

}
