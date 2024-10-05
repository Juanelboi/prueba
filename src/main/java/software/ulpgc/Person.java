package software.ulpgc;


import java.time.LocalDate;

public class Person {

    private final String name;
    private  final LocalDate birthday;
    public static final int DaysPerYear = 365;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()-birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/DaysPerYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", Age=" +  getAge() +
                '}';
    }
}
