public class Developer extends Employee{
    @Override
    public void getDetails(){
        System.out.println("Developer details");
    }
    @Override
    public void calculateSalary(){
        System.out.println("Developer salary");
    }
    @Override
    public void performTask(){
        System.out.println("Developer performTask");
    }
}
