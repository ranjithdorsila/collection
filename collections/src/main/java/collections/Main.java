package collections;
import java.util.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class Main
{
	private static final Logger l = LogManager.getLogger(NewCollection.class);
    

	public static void main(String[] args) 
    {
		int size,element;
		Scanner	sc = new Scanner(System.in);
    	NewCollection<Integer> c = new NewCollection<Integer>();
    	l.info("enter size of colletion");
        size=sc.nextInt();
        l.info("enter elements:");
        for (int i=0;i<size;i++)
        {
           element=sc.nextInt();
        	c.add(element);
        }
        
        l.info("enter index to remove element");
        element=sc.nextInt();
        c.remove(element);
        l.info("element at index 2 is "+ c.fetch(2));
        l.info("size"+c.size());
    }
}