// Inneer class or interface 
interface A {
    void f1();// abstract method or function. No body of This method
    // many static( simple like-- void f1()) method/function in interface.
    // Only one default method/function in interface. 
    
    default void f2(){
        System.out.println("This is a Default Method"); 
    }
}
class  B implements A{
    @Override
    public void f1(){
        System.out.println("After overriding the function:");
        System.out.println("Implimentation of f1 of A in sub class B");
    }
}

// Main class or outer class 
class InterfaceExample{
    public static void main(String[] args) {
        A a=new B();  // polymorphism concept.. we make object of B but it create throgh class A . We can assign The reference of subcalss to super class
        a.f1(); // After overriding the function: Implimentation of f1 of A in sub class B
        a.f2(); // This is a Default Method
    }
}