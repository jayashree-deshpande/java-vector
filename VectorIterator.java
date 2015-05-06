/** Program to iterate through vector using iterator object.
 *  You can get iterator object by calling iterator() method.
 **/
import java.util.Vector;
import java.util.Iterator;

public class VectorIterator{
	
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		v.add("Mon");
		v.add("Teu");
		v.add("wed");
		v.add("Thurs");
		v.add("Fri");
		v.add("Sat");
		v.add("Sun");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

