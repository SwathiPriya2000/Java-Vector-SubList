// Java code to illustrate subList() method 
import java.util.*; 
  
public class VectorSubList { 
    public static void main(String[] args) 
    { 
  
        // Creating an empty Vector 
        Vector<Integer> vec_tor = new Vector<Integer>(); 
  
        // Adding the elements using add() 
        vec_tor.add(5); 
        vec_tor.add(1); 
        vec_tor.add(50); 
        vec_tor.add(10); 
        vec_tor.add(20); 
        vec_tor.add(6); 
        vec_tor.add(20); 
        vec_tor.add(18); 
        vec_tor.add(9); 
        vec_tor.add(30); 
  
        System.out.println("The Vector is: " + vec_tor); 
  
        // Creating the sublist vector 
        List<Integer> sub_list = new ArrayList<Integer>(); 
  
        // Limiting the values till 5 
        sub_list = vec_tor.subList(2, 5); 
  
        // Displaying the list data 
        System.out.println("The resultant values "
                           + "within the sub list: " + sub_list); 
    } 
} 




