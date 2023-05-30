package HW1z2;
/*
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
Класс должен обладать следующими методами:
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */
public class Rectangle {
    double width;
    double height;

    public Rectangle(){
        height = width = 0.0;
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    void rectangleShow() {
        System.out.println("Ширина = " + width);
        System.out.println("Высота = " + height);
    }

    void setWidth(double width){
        this.width = width;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }
    //Вычисление площади прямоугольника
    double calculateArea() {
        return getHeight() * getWidth();
    }
    //Вычисление периметрапрямоугольника
    double calculatePerimeter() {
        return (getHeight() + getWidth())*2;
    }
    //Вывод на экран значения площади прямоугольника
    void showArea() {
        System.out.println("Площадь прямоугольника равна = " + calculateArea());
    }
    //Вывод на экран значения периметра прямоугольника
    void showPerimeter() {
        System.out.println("Периметр прямоугольника равен = " + calculatePerimeter());
    }
}
