package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
        Employee farah = new Employee(1000000);
        // System.out.println(farah.salary);
        // salary has private access only in Employee.java

        //initial salary
        System.out.println("$" + farah.getSalary());

        //10% increase
        farah.setSalary((int) ((farah.getSalary() * .1) + farah.getSalary()));
        System.out.println("$" + farah.getSalary());

    }
}
