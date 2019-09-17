//An interface is just a way of making a class having a method compulsary. The interface never has trhe logic for the method, the class that implements the interface has the logic for the method. Interface is used for multiple inheritance and polymorphism
interface rn1{
    final int a= 10;
    void display();
}
class test implements rn1 {
    public void display(){
        System.out.println("Geeks");
    }
}
public class interfaces {
    public static void main(String[] args) {
        test t = new test();
        t.display();
        System.out.println(t.a);
    }
}
