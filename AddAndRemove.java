package AddAndRemoveFromArrayList;
import java.util.*;
public class AddAndRemove {

	public static void main(String[] args) {
		ArrayList<String> words =new ArrayList<>(); 
		words.add("four");
		words.add("score");
		words.add("and");
		words.add("seven");
		words.add("years");
		words.add("ago");
		System.out.println("words ="+words);
		
		//doesn't work properly
//		for(int i=0;i<words.size();i++) {
//			words.add(i,"~");
//		}
//		System.out.println("after the 1st loop ="+words);

		//this will work for 1st loop
		for(int i=0;i<words.size();i+=2) {
			words.add(i,"~");
		}
		System.out.println("after the 1st loop ="+words);
		
		
		
		//remove every "~" from the above
		
		// 2nd loop
		
		//doesnit work properly
		
//		for(int i=0;i<words.size();i+=2) {
//			words.remove(i);
//		}
//		System.out.println("after second loop = "+ words);

		
		// this will work for loop 2
		for(int i=0;i<words.size();i++) {
			words.remove(i);
		}
		System.out.println("after second loop = "+ words);
	}

}
