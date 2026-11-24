class animal{
    String name;
    void eat(){
        System.out.println(name + "is eating");
    }
}
 
 class Dog extends animal{
    String breed;
    void bark(){
        System.out.println(name+ breed + "isbarking");
    }
    
 }
 class Inhertance{
    public static void main(String[]args){
        Dog d = new Dog();

        d.name = "tom";
        d.breed = "Labour";
        d.eat();
        d.bark();

    }
 }