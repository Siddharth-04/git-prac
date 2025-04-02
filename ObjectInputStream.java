import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ObjectInputStream {
    public static void main(String[] args) {
        Person person = new Person("Sid", 23);

        //try
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("outputByte.txt"))) {
            oos.writeObject(person);
            System.out.println("Object serialized !");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
