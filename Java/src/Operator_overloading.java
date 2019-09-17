//Operator Overloading: Java also provide option to overload operators. For example, we can make the operator (‘+’) for string class to concatenate two strings. We know that this is the addition operator whose task is to add two operands. So a single operator ‘+’ when placed between integer operands, adds them and when placed between string operands, concatenates them.
public class Operator_overloading {
void operator(String s1, String s2){
    String s =s1 + s2;
    System.out.println(s);
}
void operator (int a , int b){
    int sum= a + b;
    System.out.println(sum);
}

    public static void main(String[] args) {
        Operator_overloading sum = new Operator_overloading();
        sum.operator("Rohan", "Kamat");
        sum.operator(1,2);
    }
}
