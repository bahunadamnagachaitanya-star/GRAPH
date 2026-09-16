package CIET;

public class MinAndMax {
	public static void main(String[] args) {
		int [] arr= {2,4,5,87,8,8};
		int max= arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			max=arr[i];
		
		if(arr[i]<min) {
				min=arr[i];
		}
	}
		System.out.println("maximum :" +max);
		System.out.println("minimum :" +min);

}
}