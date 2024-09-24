public class Manager extends Employee{
    @Override
    public void getDetails(){
        System.out.println("Manager details");
    }
    @Override
    public void calculateSalary(){
        System.out.println("Manager salary");
    }
    @Override
    public void performTask(){
        System.out.println("Manager performTask");
    }
}
