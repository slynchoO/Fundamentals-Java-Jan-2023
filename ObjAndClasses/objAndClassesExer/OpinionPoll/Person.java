package fundamentals.objAndClassesExer.OpinionPoll;

public class Person {
    //полета -> характеристики
    private String name;

    private int age;

    //конструктор - метод, чрез който създаваме обекти от клас;

    public Person(String name, int age) {
        //нов празен обект;
        this.name = name;
        this.age = age;
    }

    //методи -> действия


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
