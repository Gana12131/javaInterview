package java_practice.youtube.javaGuide.java8.methodReference;

public class InstanceMethodReference {

    public static void main(String[] args) {
        InstanceMethodReference InstanceDemo = new InstanceMethodReference();
        Printable printable = m -> InstanceDemo.display(m);
        printable.print("simple test");

        Printable printable1 = InstanceDemo::display;
        printable1.print("printing msg");


    }

    public void display(String msg){
        msg=msg.toUpperCase();
        System.out.println(msg);
    }
}

@FunctionalInterface
interface Printable{
    void print(String msg);
}
