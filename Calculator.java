

public class Calculator {
	public static int sum(int[] nums){
		int sum=0;
		for(int i=0;i<nums.length;i++){
		sum+=nums[i];
		}
		return sum;
	}
	public static int sum(int a, int b){
		return a+b;
	}
	public static double sum(double a, double b){
		return a+b;
	}
	public static double avg(double c, double d){
		return (c+d)/2;
	}
	public static double avg(int []nums){
		double average=0.0;
		int sum=sum(nums);
		average=sum/nums.length;
		return average;
	}
	public static double pro(double e, double f){
		return e*f;
	}
	public static double pro(int [] nums){
		double prod=1;
		for(int i=0;i<nums.length;i++){
			prod+=nums[i];
		}
		return prod;
	}
	public static int fac(int g){
		
		
		int result=1;
		while (g>=1){
			result=result*g;
			g--;
		}
		
		return result;
	}
	public static int avg(int c, int d){
		return (c+d)/2;
	}
	public static int findsmallest(int [] nums){
		int smallest=nums[0];
		for(int i=0;i<nums.length;i++){
			if(smallest>nums[i]){
				smallest=nums[i];
			}
		}
		return smallest;
	}
	public static void sort(int [] nums){
		//int [] sortedlist=null;
		//loop thru the size of the list
		for(int i=0;i<nums.length-1;i++){
			//move to the lowest value to the first of the list
			int small=nums[i];
			int indexsmall=i;
			for(int j=i+1;j<nums.length;j++){
				if (small>nums[j]){
					
					small=nums[j];
					indexsmall=j;
					
				}
			}
			swap(i,indexsmall,nums);
		}
		//return sortedlist;
	}
	private static void swap(int indexsmall, int j, int []nums) {
		
		int temp=nums[indexsmall];
		nums[indexsmall]=nums[j];
		nums[j]=temp;
		
	}
	public static int pro(int e, int f){
		return e*f;
	}
	public static double fac(double g){
		
		
		int result=1;
		while (g>=1){
			result=(int) (result*g);
			g--;
		}
		
		return result;
	}




}
