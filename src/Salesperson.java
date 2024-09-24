public class Salesperson extends Employee{
    @Override
    public void getDetails(){
        System.out.println("Salesperson details");
    }
    @Override
    public void calculateSalary(){
        System.out.println("Salesperson salary");
    }
    @Override
    public void performTask(){
        System.out.println("Salesperson performTask");
    }
}
