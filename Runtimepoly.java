class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    }
    class Maths extends Calculator{
        @Override 
        void add(int a,int b){
            System.out.println(a+b);
        }
        
}
class Runtimepoly{
    public static void main(String[] args) {
       
    }
}
