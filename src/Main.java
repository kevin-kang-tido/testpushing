import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        }
    public static class Car {
        // Instance variable
        String model;

        // Constructor
        public Car(String modelName) {
            this.model = modelName;

        }
        // Instance method
        public void displayModel() {
            System.out.println("Input the modelName: ");
//            modelName = input.nextLine();
            System.out.println("Model: " + model);
        }
    }



    



}
