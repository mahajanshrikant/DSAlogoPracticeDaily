package com.expert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeePrcoessor {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			Date joingDateOfRam=dateFormat.parse("01-01-2002");
			Date joingDateOfmohan= dateFormat.parse("19-04-1996");
			Date joingDateOfvishnu= dateFormat.parse("30-02-1978");
			Date joingDateOfmahesh=dateFormat.parse("12-09-1945");
			
			
		List<Employee>	 emp=Arrays.asList(new Employee("Ram",500000,joingDateOfRam,"M"),
					new Employee("mohan",50000.0,joingDateOfmohan,"M"),
					new Employee("vishnu",40000.0,joingDateOfRam,"M"),
					new Employee("mahesh",30000.0,joingDateOfvishnu,"f"),
					new Employee("test",7000000.0,joingDateOfmahesh,"M")
					);
		
		
		//get max salary 
		Employee empSalary=emp.stream()
				.max((a,b)->Double.compare(a.getSalary(), b.getSalary())).get();
		System.out.println(empSalary);
		
		//get max salary --other ways
		Employee empSalary2	=emp.stream().
				max(Comparator.comparingDouble(Employee::getSalary)).get();
		//System.out.println(empSalary2);
		
		//ordered reversed
		//second highest salary
		Employee emplist=emp.stream()
				.sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
		.skip(1).
		findFirst().
		get();
	System.out.println(emplist);
	
	//senior employee based on joining date
	Employee listEmp = emp.stream().
	   min((a,b)->(a.getJoiningDate().
	   compareTo(b.getJoiningDate()))).get();
	System.out.println(listEmp);
	
	//counting male & female employees
	Map<String, Long> listEmpMap=emp.stream().collect(
	Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	System.out.println(listEmpMap);
	
	}
}
