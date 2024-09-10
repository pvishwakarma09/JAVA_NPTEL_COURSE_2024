 // Create a class Department having a method getCourses that prints "These are the department's courses". It will have two subclasses, ComputerScience and MechanicalEngineering, each having a method with the same name that prints specific courses for the respective departments.Call the method by creating an object of each of the three classes.

 class Department {
  public void getCourses() {
    System.out.println("These are the department's courses");
  }
}
class ComputerScience extends Department {
  public void getCourses() {
    System.out.println("Computer Science Engineering --> Courses: Data Structures, Algorithms, Operating Systems");
  }
}

class MechanicalEngineering extends Department {
  public void getCourses() {
    System.out.print("Mechanical Engineering --> Courses: Thermodynamics, Fluid Mechanics, Heat Transfer");
  }
}
class EngineeringDepartment {
  public static void main(String[] args) {
    ComputerScience cs = new ComputerScience();
    MechanicalEngineering me = new MechanicalEngineering();
    cs.getCourses();
    me.getCourses();
  }
}