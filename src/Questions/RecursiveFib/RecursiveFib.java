package Questions.RecursiveFib;

public class RecursiveFib {

	//1 1 2 3 5 8  13 21 34
		public static void main(String[] args) {
			for(int i=0; i<8; i++) {
				System.out.println(fibonaci(i));
			}
		}
		
		public static int fibonaci(int n) {
			if(n==0 || n==1) {
				return 1;
			}else {
				return fibonaci(n-2) + fibonaci(n-1);
			}
		}

}
