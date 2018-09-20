package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;    
    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getToday() {
        return LocalDate.now();
    }
    
    public int getAge(){
        return Period.between(birthdate, getToday()).getYears();
    }
}