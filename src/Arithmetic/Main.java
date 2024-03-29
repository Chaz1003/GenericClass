package Arithmetic;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("\nInstantiating a new object: ");
            Arithmetic art = new Arithmetic(3, 1.3);
            art.execute();
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nInstantiating a new object: ");
            Arithmetic art = new Arithmetic("hello", 1);
            art.execute();
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
        
    }
}
