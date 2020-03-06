package collections;
import java.util.*;
public class NewCollection<E> {
	    private int size = 0;
	    private static final int CAPACITY = 10;
	    private Object e[];
	    public NewCollection() {
	        e = new Object[CAPACITY];
	        for(int i=0;i<10;i++)
	        {
	        	e[size++] = i+1;
	        }
	    }
	    //add element
	    public void add(E x) {
	        if (size == e.length) {
	            ensureCapacity();
	        }
	        e[size++] = x;
	    }
	    //fetches element at specified index
	    public E  fetch(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) e[i];
	    }
	    //removes element at specified index
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = e[i];
	        int n = e.length - ( i + 1 ) ;
	        System.arraycopy( e, i + 1, e, i, n ) ;
	        size--;
	        return (E) item;
	    }
	    //return size
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < size ;i++) {
	             sb.append(e[i].toString());
	             if(i<size-1){
	                 sb.append(" ");
	             }
	         }
	         return sb.toString();
	    }
	     //resizing 
	    private void ensureCapacity() {
	        int newSize = e.length * 2;
	        e = Arrays.copyOf(e, newSize);
	    }
	

}