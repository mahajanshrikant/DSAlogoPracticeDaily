package com.expert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,23,45,67,89,11);
		List<Integer> fliteredList=list.stream().filter(i->i%2==0).toList();
		System.out.println(fliteredList);
		
		List<Integer> transaformlist=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(transaformlist);
		
		List<Integer> passList=list.stream().filter(i->i>35).collect(Collectors.toList());
		System.out.println(passList);
		
		List<Integer> graceMarks=list.stream().filter(i->i>35).
				map(j->j+5).collect(Collectors.toList());
		System.out.println(graceMarks);
		
		long countOFFailedStudents=list.stream().filter(i->i<35).count();
		System.out.println(countOFFailedStudents);
		
		
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//customized sorting //descending order
	List<Integer> sortedMarks= list.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
	System.out.println(sortedMarks);
	
	
	List<String> listOfString=Arrays.asList("A","AAA","BB","BBB","AAAAA");
	 Comparator<String> c= (a,b)->{
		  int  l1=a.length();
		  int l2=b.length();
		  if(l1<l2) return -1;
		  else if(l1>l2) return 1;
		  else return 0;
	  };
	  
	List<String> sortedString=  listOfString.stream().sorted(c).toList();
	System.out.println(sortedString);
	
	
	}
	
	
}
