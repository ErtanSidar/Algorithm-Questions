package Questions.ArrayRepetitive;

import java.util.Arrays;

public class ArrayRepetitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = {3,7,3,3,2,9,10,21,1,33,9,1};
		int repetitive[]=new int[list.length];
		
		int startIndex=0;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if((i!=j) && (list[i]==list[j])) {
					repetitive[startIndex++]=list[i];
					break;
				}
			}
		}
		Arrays.sort(repetitive);
		System.out.println(Arrays.toString(repetitive));
	}

}
