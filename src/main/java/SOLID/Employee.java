package SOLID;

public class Employee {

    public  int calculateSalary(){
        return 0;
    }


}

class PermanentEmployee extends Employee{

    @Override
    public int calculateSalary() {
        return 100000;
    }

    public int calculateBonus() {
        return 10000;
    }
}

class ContractEmployee extends Employee{
    @Override
    public int calculateSalary() {
        return 50000;
    }


}


class Main{
    public static void main(String[] args) {

        Employee e = new Employee() ;
        PermanentEmployee pe = new PermanentEmployee();


        ContractEmployee ce = new ContractEmployee();
        ce.calculateSalary();
;
    }
}
