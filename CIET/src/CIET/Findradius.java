package CIET;

public class Findradius {
	 double calculate (double area){
		return Math.PI *area*area;
		
	}
	public static void main(String[] args) {
		Findradius a= new Findradius();
		double b=a.calculate(22.5);
		System.out.println(b);
	
	}

}
