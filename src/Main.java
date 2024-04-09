import Animals.Animal;
import Animals.Bowl;
import Animals.Cat;
import Shapes.*;

public class Main {
    public static <Circle> void main(String[] args) {
        // # Задание 1
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Муся");
        cats[1] = new Cat("Буся");
        cats[2] = new Cat("Гуся");

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println("Сытость кота " + cat.name + ": " + cat.isSatiety());
        }

        bowl.addFood(10); // Добавим еду в миску

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println("Сытость кота " + cat.name + ": " + cat.isSatiety());
        }

        System.out.println("Количество животных:" + Animal.getCount());

        // # Задание 2
        Shapes.Circle circle = new Shapes.Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    public static void printShapeInfo(ShapeCalculatable shape) {
        System.out.println("Shape type: " + shape.getClass().getSimpleName());
        shape.printPerimeter();
        shape.printArea();
        if (shape instanceof Colorable) {
            Colorable colorable = (Colorable) shape;
            System.out.println("Fill color: " + colorable.getFillColor());
            System.out.println("Border color: " + colorable.getBorderColor());
        }
        System.out.println();
    }
}