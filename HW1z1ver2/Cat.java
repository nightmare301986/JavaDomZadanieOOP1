package HW1z1ver2;

public class Cat {
    private String name;
    private int age;
    private String owner;
//    private String nameOwner;

    /**
     * Открытый публичный класс Кот
     * @param name
     * @param age
     * @param owner
     */
    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    /**
     * Сетеры и гетеры
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner) {
      // this.owner = owner;
        this.owner = String.valueOf(owner);
    }

    public String getOwner() {
        return owner;
    }

    /**
     * Публичный метод "приветствие" (greet)
     */
     public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). ");

    }
}


