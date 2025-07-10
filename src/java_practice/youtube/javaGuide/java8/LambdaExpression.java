package java_practice.youtube.javaGuide.java8;

public class LambdaExpression {
    public static void main(String[] args) {
        Shape sqaure = ()-> {
            System.out.println("Square class: draw() method");
        };
        sqaure.draw();

        Shape rectangle = ()-> {
            System.out.println("Rectangle class: draw() method");
        };
        rectangle.draw();
    }

}
// without lambda expression
interface Shape{
    void draw();
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square class: draw() method");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle class: draw() method");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle class: draw() method");
    }
}


