import java.util.Vector;

public class Vect {
	public void printVector() {
		Vector vec = new Vector();
		vec.add("TIM");
		vec.add("JIM");
		
		System.out.println(vec);
		vec.remove("JIM");
		
		System.out.println(vec);
	}

}
