import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        // Create an empty Arraylist as a object.
        ArrayList <String> name =new ArrayList<>();
        // Add element in Arraylist 
        name.add("Prem"); // add method is present in util pakage
        name.add("Prem1");
        name.add("Prem2");
        name.add("Prem3");// add method is present in util pakage
        // Print Arraylist ---- [Prem, Prem1, Prem2, Prem3]
        System.out.println("After adding an element in empty ArraList:"+name);

        // Acces element by indexing similar to array. get method present in util pakage
        System.out.println("After getting zeroth index element:"+name.get(0)); // output =>  Prem
        System.out.println("After getting third index element:"+name.get(3)); // output =>  Prem3

        // Modify an element 
        System.out.println("Modify or update an element in fist index:"+name.set(1,"Rohan")); // set method present in util pakage or Arraylist. 1st index
        System.out.println("Modify or update an element in Third index:"+name.set(3,"Mohan")); // set method present in util pakage or Arraylist. 3rd index
        
        // Remove an element
        System.out.println("Remove or delete an element in Second index:"+name.remove(0)); // remove element is -Prem2
        System.out.println("Remove or delete an element in Third index:"+name.remove(1)); // remove element is--Mohan

        // Check if element exits.. In present Arraylist  or not
        System.out.println("This is Present:"+name.contains("Prem3"));  // Yes output--> Prem3

        // Get the size of Arraylist
        System.out.println("Size of The ArrayList After performing operations:"+name.size()); 
        System.out.println("Element in ArrayList After performing operations:"+name);

    }
}