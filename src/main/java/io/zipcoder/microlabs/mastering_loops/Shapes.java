package io.zipcoder.microlabs.mastering_loops;


public class Shapes {


    public String triangle(int n){

        String numStart = "triangle()\n*** Output ***\n";
        String starList = "";

        for (int i=1; i<=n; i++){

            if(i < n) {
                for (int j = 0; j < i; j++) {
                    starList = starList + "*";
                }
                starList = starList + "\n";
            }else{
                for (int j = 0; j < i; j++){
                    starList = starList + "*";
                }
            }
        }
        return numStart + starList;
    }

    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println(shape.triangle(7));
    }
}
