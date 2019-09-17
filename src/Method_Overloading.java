//Polymorphism refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities.
//When there are multiple functions with same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in number of arguments or/and change in type of arguments
public class Method_Overloading {
    static int sum(int x, int y) {
        return (x + y);
    }

    static int sum(int x, int y, int z) {
        return (x + y + z);
    }

    static double sum(double x, double y) {
        return (x + y);
    }
    public static void main(String[] args){
        Method_Overloading s = new Method_Overloading();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));

    }
}


