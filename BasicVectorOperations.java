import java.util.*;

public class BasicVectorOperations{
	
	public static void main (String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		 
		//adding elements to the end
		v.add(0);
		v.add(2);
		v.add(3);
		System.out.println(v);
		
		//adding element at specified index
		v.add(1, 1);
		System.out.println(v);

		//getting elements by index
        System.out.println("Element at index 2 is: " + v.get(2));
        
        //getting first element
        System.out.println("The first element of this vector is: "+v.firstElement());
        
        //getting last element
        System.out.println("The last element of this vector is: "+v.lastElement());
        
        //how to check vector is empty or not
        System.out.println("Is this vector empty? " + v.isEmpty());
        
	}
}
