package az.edu.turing.OOP;

import java.util.Objects;

public class Engineer extends Human {

    private  int experianceYear;

    public Engineer(String name, int age, double salary, int experianceYear) {
        super(name, age, salary);
        this.experianceYear = experianceYear;
    }

    public int getExperianceYear() {
        return experianceYear;
    }

    public void setExperianceYear(int experianceYear) {
        this.experianceYear = experianceYear;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return experianceYear == engineer.experianceYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experianceYear);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "experianceYear=" + experianceYear +
                '}';
    }
}
