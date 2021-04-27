public class Staff {
    private String name;
    private String surname;
    private int salary;
    private int id;
    private String department;

    public Staff(String name,String surname,int salary,int id,String department){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.id=id;
        this.department=department;
    }

    public void showInfos(){
        System.out.println("Name : "+name);
        System.out.println("Surname : "+surname);
        System.out.println("Salary : "+salary);
        System.out.println("Id : "+id);
        System.out.println("Department : "+department);
        System.out.println("-------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
