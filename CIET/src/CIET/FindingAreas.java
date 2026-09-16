package CIET;

public class FindingAreas {
 static double calculateArea(double side){
		return side*side;
		}
 static double calculateArea (double l,double b){
		return l*b;
		}
 static double calculateArea(double radius,boolean isCircle){
	return Math.PI *radius*radius;
	
}
 public static void main(String[] args) {
	 System.out.println(calculateArea(12));
	 System.out.println(calculateArea(12.3,33)); 
	 System.out.println(calculateArea(12.2));
	 
		
 }

}
