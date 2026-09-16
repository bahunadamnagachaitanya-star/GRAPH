package CIET;
class Humans{
	Humans(){
		System.out.println("humans stay in town");
	}
	Humans(int a){
		System.out.println("number :" +a);
	}
}

public class Constructor1 {
	public static void main(String[] args) {
		new Humans();
	}


}
