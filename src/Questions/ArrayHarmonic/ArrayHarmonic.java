package Questions.ArrayHarmonic;

public class ArrayHarmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1/numbers[i];
        }

        System.out.println("Harmonic Average :"+numbers.length/sum);

	}

}
