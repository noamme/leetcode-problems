public class RotateArray {
    
 	public static void main(String[] args){

 		int[] nums = new int[] {1, 2};

 		rotate(nums, 1);


    }



    public static void rotate(int[] nums, int k) {

    	int[] temp = new int[nums.length];
    	int j = 0;
    	k = k % nums.length;


    	for (int i = 0; i < nums.length; i++){
    		if ((i+k) < nums.length){
    			temp[i + k] = nums[i];
    		}
    		else{
    				temp[0 + j] = nums[i];
    				j++; 
    		}

    	}
    	
    	for (int i = 0; i < temp.length; i++){
    	    nums[i] = temp[i];
    	}


        
    }
}