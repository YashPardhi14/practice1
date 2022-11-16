package comparableInterface;
import java.util.*;
public class BoxingAndUnboxingExample {

	public static void main(String[] args) {
		 int n=420;
		 int m=42;
		 ArrayList<Integer> list=new ArrayList<>();
		 list.add(n);
		 list.add(n);
		 list.add(m);
		 list.add(m);
		 System.out.println("list contains:"+list);
		 //prints the Unequal because the list may contain the same int but not the same object!
		 if(list.get(0)==list.get(1)) {
			 System.out.println("equals!");
		 }
		 else {
			 System.out.println("Unequals!");
		 }
		 System.out.println();
		 //but if instead of 420 we compare the same for 42 the answer is different! 
		 /*
		  * code work for any
		  * value between -128 to 127
		  */
		 if(list.get(2)==list.get(3)) {
			 System.out.println("equals!");
		 }
		 else {
			 System.out.println("Unequals!");
		 }

	}

}
