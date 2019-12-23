package co.vinod.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import co.vinod.entity.Employee;

public class program01 {

	public static void main(String[] args) {
		Employee[] emps={
				new Employee(7700,"Smith",2200.0),
				new Employee(7654,"John",7000.0),
				new Employee(6677,"webb",1230.0),
				new Employee(9878,"Miller",3500.0),
				new Employee(6754,"Allen",5000.0),
				new Employee(3366,"Robert",2354.0),};
		//int[] nums={100,62,34,56};
		//System.out.println(Arrays.toString(emps));
		
Employee emp=Collections.min(Arrays.asList(emps)); 
	System.out.println(emp);
	
	
	}
}