package Questions.ArraySum;


public class ArraySum {
	//Array sum and average
	public static void main(String[] args) {
		
		int numbers [] = new int[]{5,7,2,3,9,10,15};
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println("Total :"+sum);
		System.out.println("Average :" + (1.0*sum)/numbers.length);

	}

}
