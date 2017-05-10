package io.zipcoder.microlabs.mastering_loops;


public class Shapes {


    public String triangle(int n){

        String shapeStart = "triangle()\n*** Output ***\n";
        String shapeList = "";

        for (int i=1; i<=n; i++){

            if(i < n) {

                for (int j = 0; j < i; j++) {
                    shapeList = shapeList + "*";
                }

                shapeList = shapeList + "\n";
            }
            else{

                for (int j = 0; j < i; j++){
                    shapeList = shapeList + "*";
                }
            }
        }
        return shapeStart + shapeList;
    }

    public String tableSquare(){

        String shapeStart = "tableSquare()\n*** Output ***\n";
        String shapeList = "";

        for(int i=1; i<=4; i++){

            if(i < 4){

                shapeList = shapeList + "| " + i + " | " + i*2 + " | " +
                        i*3 + " | " + i*4 + " |\n";

            }
            else{

                shapeList = shapeList + "| " + i + " | " + i*2 + " | " +
                        i*3 + " | " + i*4 + " |";

            }


        }


        return shapeStart + shapeList;
    }

    public String tableSquares(int n){
        return "";
    }

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println(shape.tableSquare());
    }
}
