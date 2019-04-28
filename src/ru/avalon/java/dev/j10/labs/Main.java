package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        
        Shape[] shapes = {
            new Circle(4f),
            new Circle(3f),
            new Rectangle(4f, 2f),
            new Rectangle(2f, 3f),
            new Rectangle(5f, 1f),
            new Triangle(2f, 3f, 6f),
            new Triangle(6f, 2f, 1f),
            new Triangle(3f, 4f, 4f)            
        };
        
        Shape foundShape = findShapeMaxArea(shapes);
        
        System.out.println("Максимальная площадь: "+foundShape.getArea()+". Фигура: "+foundShape.getDescription());
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
    
    /**
     * Метод для поиска в массиве фигуры Shape с максимальной площадью.
     * @param shapes массив классов Shape.
     * @return экземпляр Shape с максимальной площадью.
     */
    private static Shape findShapeMaxArea(Shape[] shapes) {
        
        Shape findShape = shapes[0];
        
        for (int i=1; i < shapes.length-1; i++){
            if (shapes[i].getArea() > findShape.getArea()){
                findShape = shapes[i];
            }
        }
        return findShape;
    }
}
