import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.introduction.Employee;



public class StreamsDemo {
	
	public static void main(String[] args) {

		 List<Employee>empList=new ArrayList<>();
		 
	     empList.add(new Employee(1, "Ajay", 20000));
		 empList.add(new Employee(2, "Suraj", 50000));
		 empList.add(new Employee(3, "Ram", 57000));
		 empList.add(new Employee(4, "Vikas", 57000));
		 empList.add(new Employee(4, "Vikas", 57000));
		 
		System.out.println( empList.stream().count());
		empList.stream().distinct().forEach(System.out::println);	
		System.out.println(empList.get(3).equals(empList.get(4)));
		
		empList.stream().dropWhile(emp1->emp1.getSalary()>=30000).forEach(System.out::println);
	    empList.forEach(System.out::println);
		
	
	}

}
