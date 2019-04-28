package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Point, Polygon{
    private float side1;
    private float side2;
    private float side3;
    private float x;
    private float y;
    private int rotation;
    
    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public Triangle(float side1, float side2, float side3, int rotation){
        this(side1, side2, side3);
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
        float semiPerimetr = side1+side2+side3;
        return (float)Math.sqrt(semiPerimetr*(semiPerimetr-side1)*(semiPerimetr-side2)*(semiPerimetr-side3));
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
        return side1+side2+side3;
    }
    
    @Override
    public String getDescription (){
        return ("Треугольник с параметрами: \n - сторона 1: "+side1+"\n - сторона 2: "+side2+"\n - сторона 3: "+side3);
    }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
