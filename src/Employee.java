/**
 * Employee.java - Employee Benefits Management
 * @author Ryan Earl
 * @version 1
 */
public class Employee {
    private String name;
    private String position;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationDays;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "";
        baseSalary = 50000;
        yearsOfExperience = 1;
        yearsAtCompany = 1;
        position = "";
        //TODO use default values

    }

//    /**
//     * Parameterless constructor
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
//     */
    public String Employee(String thePosition, String theName, int experience, int company, double salary, int vacation){
        name = theName;
        baseSalary = salary;
        yearsOfExperience = experience;
        yearsAtCompany = company;
        position = thePosition;
        vacationDays = vacation;

        return "";
    }

    //TODO Add needed getters and setters

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        System.out.println("Tgn is: " + position);
        System.out.println("Name: " + name);
        System.out.println("Their Base Salary is: $" + baseSalary);
        System.out.println("They have " + yearsOfExperience + " years of experience");
        System.out.println("They have worked at this company for " + yearsAtCompany + " years");
        System.out.println("They are allowed to have " + vacationDays + " weeks of vacation per year");
        //TODO
        return "";
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "Personal Motto: ";
    }
    public static void main(String[] args) {
        Employee e = new TechnicalWriter();
        System.out.println(e.toString());
        Employee e1 = new Engineer();
        System.out.println(e1.toString());
        Employee e2 = new ProductManager();
        System.out.println(e2.toString());
    }
}





