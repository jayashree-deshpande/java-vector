import java.util.*;

public class VectortoArrayCopy{
	
	public static void main(String[] args)
	{
		int i;
		
		Vector<String> v = new Vector<String>();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
	        
		System.out.println("vector is:"+ v);
		
		String[] copyArray = new String[v.size()];
		v.copyInto(copyArray);
		
		System.out.println("Copied Array content:");
		
		for(i=0 ; i< copyArray.length ; ++i)
		{
			System.out.println(copyArray[i]);
		}
	}
}
