//Runtime polymorphism: It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.
//Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

//1.Final methods can not be overridden
//2.Static methods can not be overridden(Method Overriding vs Method Hiding)
//3.Private methods can not be overridden
//4.The overriding method must have same return type (or subtype)


class Parent{
    void Print(){
        System.out.println("Parent class");

    }
}
class subclass1 extends Parent {
    void Print() {
        System.out.println("Subclass 1");
    }

}
class subclass2  extends  Parent{
    void Print(){
        System.out.println("Subclass2");
    }
}
public class Method_overiding {
    public static void main(String[] args) {
    Parent p= new Parent();
    p.Print();
    p = new subclass1();
    p.Print();
    p=new subclass2();
    p.Print();

    }
}
