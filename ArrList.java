import java.util.ArrayList;
import java.util.List;

public class ArrList {
	public void printArrayList(){
		List<String> list = new ArrayList<String>();
		list.add("TOM");
		list.add("Harry");
		
		System.out.println(list);
		
		list.remove("Harry");
		System.out.println(list);
		
	}
	

}
