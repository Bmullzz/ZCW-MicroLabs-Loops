package io.zipcoder.microlabs.mastering_loops;
import java.util.Random;


public class Numbers {


    public String oneToTen() {
        String numStart = "*** Output ***\noneToTen()\n";
        String numList = "";

        for (int i = 1; i < 11; i++) {
            if(i <= 9){
                numList = numList + Integer.toString(i) + "\n";
            }
            else{
                numList = numList + Integer.toString(i);
            }
        }
        return numStart + numList;
    }

    public String oddNumbers() {
        String numStart = "oddNumbers()\n*** Output ***\n";
        String numList = "";

        for (int i = 1; i < 20; i += 2) {
            if(i < 19){
                numList = numList + Integer.toString(i) + "\n";
            }
            else{
                numList = numList + Integer.toString(i);
            }
        }
        return numStart + numList;
    }

    public String squares() {
        String numStart = "squares()\n*** Output ***\n";
        String numList = "";

        for (int i = 1; i < 11; i ++) {
            if(i <= 9){
                numList = numList + Integer.toString(i * i) + "\n";
            }
            else{
                numList = numList + Integer.toString(i * i);
            }
        }
        return numStart + numList;

    }

    public String random4() {

        Random random = new Random();

        String numStart = "random4()\n*** Output ***\n";
        String numList = "";
        //int num = random.nextInt(10) + 1;

        for (int i = 1; i <= 4; i++){
            int num = random.nextInt(10) + 1;

            if(i < 4){
                numList = numList + Integer.toString(num) + "\n";
            }
            else{
                numList = numList + Integer.toString(num);
            }

        }

        return numStart + numList;
    }

    public String even(int n) {

        return "";
    }

    public String powers(int n) {
        return "";
    }



    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        System.out.print(numbers.random4());
    }
}




