package main.radio.classen;

public class Person {

    private String name;
    private Integer alter;
    private String lieblingsessen;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer alter) {
        this.name = name;
        this.alter = alter;
    }

    public void setLieblingsessen(String lieblingsessen) {
        this.lieblingsessen = lieblingsessen;
    }

    public String getLieblingsessen() {
        return lieblingsessen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", lieblingsessen='" + lieblingsessen + '\'' +
                '}';
    }
}
