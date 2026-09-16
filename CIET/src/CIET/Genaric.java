package CIET;
class Box<T>{
	private T value;
	public void set(T value) {
		this.value=value;
	}
	public T get() {
		return value;
	}
}

public class Genaric {
	public static void main(String[] args) {
		Box<String> strBox=new Box<>();
		strBox.set("chaitanya");
		System.out.println(strBox.get());
		Box<Integer> intBox=new Box();
		intBox.set(100);
		System.out.println(intBox.get());
	}

}
