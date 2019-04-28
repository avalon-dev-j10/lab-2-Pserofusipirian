package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Point, Polygon {
    
    private float side1;
    private float side2;
    private float x;
    private float y;
    private int rotation;
    
    public Rectangle(float side1, float side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public Rectangle(float side1, float side2, int rotation){
        this(side1, side2);
        this.rotation = rotation;
    }
    
    @Override
    public void setRotation(int rotation){
        this.rotation = rotation;
    }
    
    @Override
    public int getRotation(){
        return rotation;
    };
    
    @Override
    public float getArea(){
        return side1*side2;
    };
    
    @Override
    public void setCoordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public float getX() {
        return x;
    }
    
    @Override
    public float getY() {
        return y;
    }
    
    @Override
    public float getPerimeter() {
        return side1*2+side2*2;
    }
    
    @Override
    public String getDescription (){
        return ("Прямоугольник с параметрами: \n - сторона 1: "+side1+"\n - сторона 2: "+side2);
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
