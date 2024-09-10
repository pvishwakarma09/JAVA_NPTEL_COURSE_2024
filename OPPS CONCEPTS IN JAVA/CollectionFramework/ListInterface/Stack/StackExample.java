import java.util.Stack;
// Stack follows LIFO( Last in first out )
public class StackExample{
    public static void main(String[] args) {
        // Create an empty Stack as a object.
        Stack <String> name =new Stack<>();
        // // Add element in Stack.. add methhod 
        // name.add("Prem"); // add method is present in util pakage
        // name.add("Prem1");
        // name.add("Prem2");
        // name.add("Prem3");// add method is present in util pakage
        // // Print Stack ---- [Prem, Prem1, Prem2, Prem3]

        // push method in Stack
        name.push("Prem"); 
        name.push("Prem1");
        name.push("Prem2");
        name.push("Prem3");
        System.out.println("After push an element in empty Stack:"+name);

        // // Acces element by indexing similar to array. get method present in util pakage
        // System.out.println("After getting zeroth index element:"+name.get(0)); // output =>  Prem
        // System.out.println("After getting third index element:"+name.get(3)); // output =>  Prem3

        // peek() method in stack.. last element get karega
        System.out.println("After getting last element:"+name.peek());
        System.out.println("Element in  Stack:"+name);
        // Modify an element 
        System.out.println("Modify or update an element in fist index:"+name.set(1,"Rohan")); // set method present in util pakage or Stack. 1st index
        System.out.println("Element in  Stack:"+name);
        System.out.println("Modify or update an element in Third index:"+name.set(3,"Mohan")); // set method present in util pakage or Stack. 3rd index
        System.out.println("Element in  Stack:"+name);
        
        // // Remove an element
        // System.out.println("Remove or delete an element in Second index:"+name.remove(0)); // remove element is -Prem2
        // System.out.println("Remove or delete an element in Third index:"+name.remove(1)); // remove element is--Mohan
        
        // Remove element in Stack
        System.out.println("Pop or delete an element in Second index:"+name.pop()); //pop element is Mohan
        System.out.println("Element in  Stack:"+name);

        // Check if element exits.. In present Stack  or not
        System.out.println("This is Present:"+name.contains("Prem3"));  // false
        System.out.println("Element in  Stack:"+name);

        // Get the size of Stack
        System.out.println("Size of The Stack After performing operations:"+name.size());  // size-- 3
        System.out.println("Element in Stack After performing operations:"+name); // [Prem, Rohan, Prem2]

    }
}