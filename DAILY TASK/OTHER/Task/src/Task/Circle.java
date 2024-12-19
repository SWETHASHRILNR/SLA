package Task;
class Simple 
{
    int radius;
    String color;
    public Simple() 
    {
        this.radius = 1;
        this.color = "red";
    }
    public Simple(int radius, String color) 
    {
        this.radius = radius;
        this.color = color;
    }
    public void display() 
    {
        System.out.println("Circle is of " + this.radius + "cm radius and is " + this.color + " in color");
    }
}
public class Circle 
{
    public static void main(String[] args) 
    {
        Simple circle1 = new Simple();
        circle1.display();
        Simple circle2 = new Simple(5, "blue");
        circle2.display();
    }
}

