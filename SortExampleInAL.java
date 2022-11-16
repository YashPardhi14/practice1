package comparableInterface;
import java.util.*;
public class SortExampleInAL {

	public static void main(String[] args) {
		 
		ArrayList<String> words=new ArrayList<>();
		
		words.add("four");
		words.add("score");
		words.add("and");
		words.add("seven");
		words.add("years");
		words.add("ago");
		
		//show the words list before and after the sort
		
		System.out.println("before sort,words="+words);
		Collections.sort(words);
		System.out.println();
		System.out.println(" after sort,words="+words);
	}

}
