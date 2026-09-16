package CIET;
import java.util.function.*;

public class BuiltinLambdaEx {
	public static void main(String[] args) {
		Predicate<Integer> isEven= number->number%2==0;
		System.out.println("Predicate");
		System.out.println("10 is even"+isEven.test(10));
		System.out.println("7 is even"+isEven.test(7));
		Consumer<String> printName= name->System.out.println("Hello" +name);
		System.out.println("\nconsumer");
		printName.accept("chaitanya");
		Function<Integer , Integer> square= number->number*number;
		System.out.println("\nfunction:");
		System.out.println("square of 5 :"+square.apply(5));
		System.out.println("square of 7 :"+square.apply(7));
		Supplier<String> message=()->"hello from supplier";
        System.out.println("\nsupplier");
        System.out.println(message.get());
        Predicate<String> isLongName=name->name.length()>5;
        System.out.println("\npredicate");
        System.out.println(isLongName.test("chaitanya"));
	}
}
