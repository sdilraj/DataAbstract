import java.util.LinkedList;
import java.util.List;

public class LinList {
	public void printLinList() {
		List<String> llist = new LinkedList<String>();
		llist.add("TOMM");
		llist.add("HARRY");
		
		System.out.println(llist);
		
		llist.remove("HARRY");
		
		System.out.println(llist);
		
	}

}
