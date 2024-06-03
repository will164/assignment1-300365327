package code_part2;

public class Test {

    public static void main(String[] args) {
        Address[] addresses = new Address[10];
        addresses[0] = new Address("Queen",48,"K1P1N2");
        addresses[1] = new Address("King Edward",48,"K1N6N5");
        Employee employee = new Employee("Falcao", 40, 15.5,addresses);
        System.out.println(employee);
    }

}
