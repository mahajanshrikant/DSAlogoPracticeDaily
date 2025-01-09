package com.expert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	List<Integer> numList=Arrays.asList(10,20,30,50,68);
	Integer maxNum=numList.stream().max((a,b)->Integer.compare(a,b)).get();
	System.out.println(maxNum);
	
	Integer minNum=numList.stream().min((a,b)->Integer.compare(a, b)).get();
	System.out.println(minNum);
	
	//two ways 
	numList.stream().forEach(i->System.out.println(i));
		
	numList.stream().forEach(System.out::println);
	
	//convert array to stream
	Integer[] arr= {10,23,45,67,89};
	Arrays.stream(arr).forEach(System.out::println);
	
	
	//StreamOF();
	
	  Stream<?> item=Stream.of(8,9,7,"AA","bb");
	item.forEach(System.out::println);
	
	//stream()
	//filter()
	//map()
	//collect()
	//count()
	///sorted()
	//sorted(Comparator())
	//max()
	//min()
	//forEach()
	//toArray()
	//Stream.of(null);
	}
	
	
	
	
}
