package code_part2;

import java.util.Arrays;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    private Address[] Addresses = new Address[5];

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Address[] getAddresses() {
        return Addresses;
    }

    public void setAddresses(Address[] Addresses) {
        this.Addresses = Addresses;
    }

    public Employee(String name, double hours, double rate, Address[] Addresses) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.Addresses = Addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", Addresses=" + Arrays.toString(Addresses) +
                '}';
    }
}
