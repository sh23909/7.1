package c5;

public class CalculatorDrive {
	public static void main (String [] args){
		int nums[] = new int[10];
		for(int i=0;i<10;i++){
			nums[i]=i+1;
		}
		for(int x:nums){
			System.out.print(x+".");
		}
		int numbers[]={11,22,33,42,5,16,70,18,9,100};
		/*System.out.println("length " + numbers.length);
		for(int i=0;i<numbers.length;i++){
		System.out.print(numbers[0]);
		}*/
		System.out.println(Calculator.findsmallest(numbers));
		System.out.println("The sorted list is ");
		Calculator.sort(numbers);
		//int []sortedlist=Calculator.sort(numbers);
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i] + " ");
		}
		/*System.out.println(Calculator.sum(nums));
		System.out.println(Calculator.sum(1,4));
		System.out.println(Calculator.sum(1.2,4.3));
		System.out.println(Calculator.avg(1.2,4.3));
		System.out.println(Calculator.avg(1,4));
		System.out.println(Calculator.pro(1.2,4.3));
		System.out.println(Calculator.pro(1,4));
		System.out.println(Calculator.fac(5));
		System.out.println(Calculator.fac(4));*/
	}

}
