// define a functional interface for adding two numbers

@FunctionalInterface
// Create a interface
interface Sum{
    int add(int a, int b);
}
// Create a Main class 
public class LamdaExpression{
    public static void main(String[] args) {
        // create a lambda expression that implements the Sum interface
        Sum sum =(a,b)-> a+b;
        // use the lambda expression to sum two numbers
        int result=sum.add(10,16);
        System.out.println("Result is :"+result); // output 26
    }
}