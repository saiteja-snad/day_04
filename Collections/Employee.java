package collections;

import java.util.*;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

       class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list =
                new ArrayList<>();

        list.add(new Employee(1,"Rahul"));
        list.add(new Employee(2,"Aman"));
        list.add(new Employee(3,"Neha"));
        for(int i=0;i<list.size();i++) {
        	Employee e=list.get(i);
        
        System.out.println(
                e.id + " " + e.name);
    }
        System.out.println("=================================");
        for(Employee e : list) {

            System.out.println(
                    e.id + " " + e.name);
        }
        System.out.println("=================================");
         
        Iterator<Employee> il=list.iterator();
        while(il.hasNext()) {
            Employee e = il.next();

            System.out.println(
                    e.id + " " + e.name);
        }        }
}