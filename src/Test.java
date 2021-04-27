import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Developer developer=new Developer("Ali","Ünaldı",5000,1,"Backend","Java","Intern");

        Manager manager=new Manager("Vincent","Aboubakar",70000,1,"Human Resources",10);

        String menu="Operations \n" +
                "1.Developer Operations \n" +
                "2.Manager Operations \n" +
                "3.Quit \n" +
                "-----------------------";
        System.out.println(menu);
        System.out.print("Choose an operation -->");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        if (option==1){
            String dmenu="Developer Operations\n" +
                    "1.Develop a program.\n" +
                    "2.Change programming language.\n" +
                    "3.Quit";
            System.out.println(dmenu);
            System.out.print("Choose an operation -->");
            int doption=scanner.nextInt();
            if (doption==1){
                developer.delevop();
            }
            else if (doption==2){
                System.out.print("Enter new programming language -->");
                String npl=scanner.nextLine();
                npl=scanner.nextLine();
                developer.setpLanguage(npl);
                System.out.println(developer.getName()+"'s new programming language is "+npl);
            }
            else {
                System.exit(0);
            }

        }
        if (option==2){
            String mmenu="Manager Operations\n" +
                    "1.Raise your salary.\n" +
                    "2.Yell at workers.\n" +
                    "3.Raise "+developer.getName()+"'s salary.\n" +
                    "4.Quit";
            System.out.println(mmenu);
            System.out.print("Choose an operation -->");
            int moption=scanner.nextInt();
            if (moption==1){
                System.out.print("Enter the raise amount -->");
                int amount1=scanner.nextInt();
                manager.raise(amount1);
                System.out.println("Your new salary is "+manager.getSalary());
            }
            else if (moption==2){
                manager.yell();
            }
            else if (moption==3){
                System.out.print("Enter the raise amount -->");
                int amount2=scanner.nextInt();
                developer.setSalary(developer.getSalary()+amount2);
                System.out.println(developer.getName()+"'s new sallary is :"+developer.getSalary()+".");
            }
            else {
                System.exit(0);
            }
        }

        else {
            System.exit(0);
        }


    }
}
