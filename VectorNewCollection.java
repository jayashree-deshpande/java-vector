import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorNewCollection{
	
	public static void main(String[] args){
		
        Vector<String> v = new Vector<String>();
        
        //adding elements to the end
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");
        
        System.out.println("Actual vector:"+ v);
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        
        v.addAll(list);
        System.out.println("After Copy: "+v);
        
        v.addAll(2, list);
        System.out.println("When copied to a perticular index: "+ v);
        
        System.out.println("Current capacity of the vector is: " + v.capacity());
        
        System.out.println("does it contains element 'First'?: " + v.contains("First"));
        
        System.out.println("does it contains element 'six'?: " + v.contains("six"));
        
        System.out.println("does it contains list collection ?: " + v.containsAll(list));

	}
}
