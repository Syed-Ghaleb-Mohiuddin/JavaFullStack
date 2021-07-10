package Week2HomeWorks;

public class SumOfArray {
	public static void main(String[] args) {
		int sum = 0;
		int array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		for (int num : array) {
			sum+=num;
		}
		System.out.println("the some of the array is : "+sum);
	}
}
