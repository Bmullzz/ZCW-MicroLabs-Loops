package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;

public class CarRide {

    Scanner input = new Scanner(System.in);

    public String areWeThereYet(){

        //System.out.println("Are we there yet?");

        boolean answer = false;
        String userInput;

        while(answer != true){

            System.out.println("Are we there yet?");
            userInput = input.nextLine();
            userInput = userInput.toLowerCase();

            if(userInput.contains("yes")) break;
            if(userInput.contains("yeah")) break;
            if(userInput.contains("we hurr")) break;

        }

        return "Good!";
    }

    public static void main(String[] args) {
        CarRide carRide = new CarRide();
        System.out.println(carRide.areWeThereYet());
    }

}
