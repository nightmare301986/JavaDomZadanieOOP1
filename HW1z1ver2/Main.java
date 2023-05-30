package HW1z1ver2;

import java.util.Scanner;

/*
Создайте класс "Кот" (Cat) со следующими свойствами:
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>.
Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
 */

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя кота(кошки): ");
        String catName = scanner.nextLine();

        System.out.print("Введите возраст кота(кошки): ");
        int catAge = scanner.nextInt();

        scanner.nextLine(); // очистка буфера

        System.out.print("Введите имя хозяина кота(кошки): ");
        String nameOwner = scanner.nextLine();

        Owner owner = new Owner(nameOwner);
        Cat cat = new Cat(catName, catAge, nameOwner);
        
        cat.setOwner(owner);
        cat.greet();

        System.out.println("Мяу! Меня зовут " + cat.getName() +" Мне " + cat.getAge() + " года(лет). Мой владелец " + owner.getName());
    }
}