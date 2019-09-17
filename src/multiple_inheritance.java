interface five{
    public void print_geek();
}
interface six{
    public void print_for();
}
interface seven extends five,six{
    public void print_geek();
}
class child implements seven{
    @Override
    public void print_geek(){
        System.out.println("Geeks");
    }

    public void print_for(){
        System.out.println("for");
    }


}
public class multiple_inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
