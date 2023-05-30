package HW1z1ver2;

/**
 * Класс "Владелец" (Owner) со свойством "имя" (name) типа String
 */
public class Owner {
    private String nameOwner;

    /**
     * Публичный метод Owner
     * @param nameOwner
     */
    public Owner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getName() {
        return nameOwner;
    }

    public void setName(String Owner) {
        this.nameOwner = nameOwner;
    }
}