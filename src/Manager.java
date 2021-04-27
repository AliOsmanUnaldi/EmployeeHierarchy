public class Manager extends Staff{
    private int personnalNumber;

    public Manager(String name, String surname, int salary, int id, String department, int personnalNumber) {
        super(name, surname, salary, id, department);
        this.personnalNumber = personnalNumber;
    }

    public void showInfos(){
        super.showInfos();
        System.out.println("Manager informations");
        System.out.println("Personal Number : "+personnalNumber);
        System.out.println("----------------------");
    }

    public void yell(){
        System.out.println("Yelling at to the employees...");
    }

    public void raise(int amount){
        setSalary(getSalary()+amount);
        System.out.println("Your salary increased "+amount+" more!");

    }

    public int getPersonnalNumber() {
        return personnalNumber;
    }

    public void setPersonnalNumber(int personnalNumber) {
        this.personnalNumber = personnalNumber;
    }
}
