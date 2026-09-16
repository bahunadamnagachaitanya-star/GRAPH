package CIET;
import java.util.*;
import java.util.stream.Collectors;


public class ApiEx {
	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(10,20,30,40,25);
	List<Integer> result=numbers.stream()
			.distinct()
			.filter(n -> n>10)
			.sorted((a,b)-> b-a)
			.limit(3)
			.collect(Collectors.toList());
	int sum=result.stream()
			.reduce(0,Integer :: sum);
	System.out.println(result);
	System.out.println("sum is :"+sum);
}

}


