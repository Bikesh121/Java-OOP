package Interface;

interface sum{
    default void add(int a, int b){
        printMessage();
        System.out.println("Sum: "+(a+b));
    }
    private void printMessage(){
        System.out.println("Calculating sum...");
    }
}

interface sub{
    default void difference(int a, int b){
        printMessage();
        System.out.println("Difference: "+(a-b));
    }
    private void printMessage(){
        System.out.println("Calculating Difference...");
    }
}

public class Main implements sub, sum{
    public static void main(String[] args) {
        Main m = new Main();

        m.add(5,4);
        m.difference(10, 5);
    }
}
