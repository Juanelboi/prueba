package software.ulpgc;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person Juan = new Person("Juan", LocalDate.of(2004,05,3));
        System.out.println(Juan);
    }

}