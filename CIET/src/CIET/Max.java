package CIET;

public class Max {
	static int findmax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];		
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,5,8,45};
		System.out.println(findmax(arr));
	}
	

}
