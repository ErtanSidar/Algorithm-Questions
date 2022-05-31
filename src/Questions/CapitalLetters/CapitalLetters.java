package Questions.CapitalLetters;

public class CapitalLetters {
	//Arrange the first letter of all words in a given sentence 
	//in capital letters and the other letters in lower case.
	public static void main(String[] args) {
		
		String sentence="arrAnge tHe fIrSt letter oF all worDs in a giVEn senTEnce "
				+ "iN capiTAl lettERs and THe other leTTers in lOWer CAse.";
		boolean isBeforeLetterSpace = true;
		String s="", newString="";
	
		for (int i = 0; i < sentence.length(); i++) {
			s=sentence.substring(i, i+1);
			if(s==" ") {
				s.toUpperCase();
				newString+=s;
			}
		}

	}

}
