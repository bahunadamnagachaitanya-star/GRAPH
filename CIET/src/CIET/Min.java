package CIET;

public class Min {
	static int findmin(int[] arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];		
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,5,8,45};
		System.out.println(findmin(arr));
	}
	

}
