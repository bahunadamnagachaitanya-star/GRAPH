package DEMO;

public class Hello1 {
	
	    public static void main(String[] args) {

	        int[] arr = {10, 20, 10, 30, 20, 10, 40};

	        for (int i = 0; i < arr.length; i++) {

	            boolean alreadyCounted = false;

	            for (int k = 0; k < i; k++) {
	                if (arr[k] == arr[i]) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }

	            if (alreadyCounted) {
	                continue;
	            }

	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            System.out.println(arr[i] + " - " + count);
	        }
	    }
	}

