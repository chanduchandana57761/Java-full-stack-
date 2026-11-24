class Employee{
    String name;
    double baseSalary;
    void displayBasicInfo(){
        System.out.println("Employee Name" + name);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void writeCode(){
        System.out.println("Programming Language:" +programmingLanguage);
 }
}
class Tester extends Employee{
    String testingTool;
    void runtests(){
        System.out.println("Testing Tool:" + testingTool);
    }
}
class Hierarchicalinheritance{
    public static void main(String[] args) {
        Developer d = new Developer();

        d.name= "Bala";
        d.baseSalary = 60000;
        d.programmingLanguage = "Java";
        System.out.println("Developer Details");    
        d.displayBasicInfo();   
        d.writeCode();

        Tester t = new Tester();
        t.name = "Ravi";    
        t.baseSalary = 50000;
        t.testingTool = "Selenium";
        System.out.println("Tester Details");
        t.displayBasicInfo();
        t.runtests();

    }
}