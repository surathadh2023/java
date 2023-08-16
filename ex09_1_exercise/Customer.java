package ex09_1_exercise;

public class Customer {
    private String name;
    private String ssn;

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public String getSSN() {
        return ssn;
    }
}