public class Developer extends Staff{
    private String pLanguage;
    private String experience;

    public Developer(String name, String surname, int salary,int id, String department, String pLanguage, String experience) {
        super(name, surname, salary,id, department);
        this.pLanguage = pLanguage;
        this.experience = experience;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Developer Informations");
        System.out.println("Programming Language : "+pLanguage);
        System.out.println("Experience : "+experience);
        System.out.println("----------------------");
    }

    public void delevop(){
        System.out.println("Developing program...");
    }

    public String getpLanguage() {
        return pLanguage;
    }

    public void setpLanguage(String pLanguage) {
        this.pLanguage = pLanguage;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
