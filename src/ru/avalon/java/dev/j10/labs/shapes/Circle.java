package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape, Ellipse, Point {
    
    private float radius;
    private float x;
    private float y;
            
    public Circle (float radius){        
        this.radius = radius;    
    }
    
    public Circle (float radius, float x, float y) {        
        this(radius);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public float getArea() {
        return (float)(Math.PI*Math.pow(radius, 2));
    };
    
    @Override
    public float getLength() {
        return (float)Math.PI*radius*2;
    }
    
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
    public String getDescription (){
        return ("Круг с параметрами: \n -радиус: "+radius);
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
