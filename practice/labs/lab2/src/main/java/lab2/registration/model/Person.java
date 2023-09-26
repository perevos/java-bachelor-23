package lab2.model;

/**
 * Класс для базовой информации о человеке
 */
public class Person {

    /**
     * идентификатор человека
     */
    private long id;

    /**
     * ФИО человека
     */
    private String name;

    // геттеры и сеттеры
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
