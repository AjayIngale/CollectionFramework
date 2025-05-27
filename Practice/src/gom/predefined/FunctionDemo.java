package gom.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
	Function<Integer, Integer>squareIt=num->num*num;
	System.out.println(squareIt.apply(10));
	
	Function<Integer,Float>divideIt=num->num/2.0f;
	System.out.println(divideIt.apply(1000));

	
		
	}

}
