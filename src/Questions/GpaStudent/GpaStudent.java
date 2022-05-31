package Questions.GpaStudent;

public class GpaStudent {
	//GPA of the students who are successful in the class (50 or more is considered successful)
	public static void main(String[] args) {
		
		int point [] =new int[] {45,55,95,43,76,50,83,38};
		int sum=0, successStudent=0;
		for (int i = 0; i < point.length; i++) {
			if(point[i]>=50) {
				sum+=point[i];
				successStudent++;
			}
		}
		System.out.println("Succees Student :"+successStudent);
		System.out.println("Success Student Average :"+(1.0)*sum/successStudent);

	}

}
