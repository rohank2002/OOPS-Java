//An abstract class can be extended inherited or used for polymorphism, an object of this class cannot be created.
abstract class animal{
    public void property(String Name, int legs){
        System.out.println(legs);

    }
}
class dog extends  animal{

}
public class abstract_classes {
    public static void main(String[] args) {
       dog d = new dog();
       d.property("pluto",3);
    }
}
