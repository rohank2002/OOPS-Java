import java.util.*;
import java.lang.*;
import java.io.*;
class one {
    public void print_greek(){
        System.out.println("Geeks");
    }
}
class two extends one {
    public void print_for(){
        System.out.println("for");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
    two g = new two();
    g.print_greek();
    g.print_for();
    g.print_greek();
    }
}
