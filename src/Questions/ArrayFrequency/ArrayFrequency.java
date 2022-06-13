package Questions.ArrayFrequency;

public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tmp, count=1;
		
		int arr[]= {10,20,20,10,10,20,5,20};
		
		for (int i = 0; i < arr.length; i++) {
			tmp=arr[i];
			count=1;
			for (int j = 0; j < arr.length; j++) {
				if((i!=j)&&(arr[i]==arr[j])) {
					count++;
					arr[j]=0;
				}
			}
			System.out.println("The number "+ tmp +" was repeated "+ count +" times.");
		}

	}

}
