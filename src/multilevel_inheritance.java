import java.util.*;
import java.lang.*;
import java.io.*;
class three extends two{
    public void print_geek(){
        System.out.println("Geeks");
    }
}

public class multilevel_inheritance
{
    public static void main(String[] args) {
    three g = new three();
    g.print_geek();
    g.print_for();
    g.print_geek();
    }
}
