/*
Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
*/
class Test_Encapsulation{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public int getAge(){
        return  geekAge;
    }
    public String getName(){
        return geekName;
    }
    public int getRoll(){
        return geekRoll;
    }

    public void setAge(int newAge){
        geekAge = newAge;
    }
    public void setName(String Name){
        geekName=Name;
    }
    public void setRoll(int Roll){
        geekRoll=Roll;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
    Test_Encapsulation en = new Test_Encapsulation();
    en.setAge(23);
    en.setName("Rohan");
    en.setRoll(12);
        System.out.println("The name is : " +en.getName());
        System.out.println("Age : " +en.getAge());
        System.out.println("Roll no. is : " +en.getRoll());
    }
}
