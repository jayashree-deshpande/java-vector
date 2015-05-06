import java.util.Vector;

public class VectorClone{
	
	public static void main(String a[]){
		
		Vector<String> v = new Vector<String>();
		//adding elements to the end
		v.add("First");
		v.add("Second");
		v.add("Third");
		v.add("Random");
		System.out.println("Actual vector:"+ v);
		Vector<String> vCopy = (Vector<String>) v.clone();
		System.out.println("Cloned vector:"+vCopy);
	}
}
