package co.vinod.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.vinod.entity.Employee;

public class program01 {
	/*for comparator only*/
	static class EmployeeNameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			return e1.getName().compareTo(e2.getName());
		}
		
	}
	static class EmployeeSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			return Double.compare(e1.getSalary(),e2.getSalary() );
		}
		
	}
	public static void main(String[] args) {
		
		/*Employee e1=new Employee(6543,"Scott",2300.0);
		Employee e2=new Employee(7654,"Smith",800.0);
	if(e1.compareTo(e2)<0){
		System.out.printf("%s joined the company before %s",e1.getName(),e2.getName());
	}
	else if(e1.compareTo(e2)==0){
		System.out.printf("%s joined the company after %s",e1.getName(),e2.getName());
	}
	else{
		System.out.printf("%s joined the company together %s",e1.getName(),e2.getName());
	}*/
		/* 2nd program comment
		List <Employee>list=new ArrayList<Employee>();
		 
		list.add(new Employee(7768,"Smith",2200.0));
		list.add(new Employee(7654,"john",4143.0));
		list.add(new Employee(6754,"xlles",1200.0));
		list.add(new Employee(4366,"Robert",2314.0));
Collections.sort(list);
for(Employee e:list)
	System.out.println(e);
	*/
		/* for comparator*/
		List <Employee>list=new ArrayList<Employee>();
		 
		list.add(new Employee(7768,"Smith",2200.0));
		list.add(new Employee(7654,"john",4143.0));
		list.add(new Employee(6754,"xlles",1200.0));
		list.add(new Employee(4366,"Robert",2314.0));
Collections.sort(list,new EmployeeSalaryComparator());
for(Employee e:list)
	System.out.println(e);
		
	}

}
