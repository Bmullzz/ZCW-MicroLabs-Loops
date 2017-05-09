package io.zipcoder.microlabs.mastering_loops;


public class Shapes {


    public void triangle(int n){

        for (int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.triangle(9);
    }
}
