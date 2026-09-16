package CIET;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ApiEx1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("john","Alice","Ajith","chaitanya","raj","karthik");
		List<String> result=names.stream()
				.filter(name -> name.startsWith("A"))
				.map(String :: toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
