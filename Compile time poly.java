class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(float a,float b){
        System.out.println(a+b);
    }
}
class Compiletimepoly{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(a:2.0f,b:3.0f);
    }
}
