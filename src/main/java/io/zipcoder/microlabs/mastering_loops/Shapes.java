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

        String tableStart = "tableSquare()\n*** Output ***\n";
        String tableList = "";
        int multiply;

        for(int i=1; i <= 4; i++){
            tableList += "\n";
            for(int j =1; j <= 4; j++){
                tableList += "|";
                multiply = i * j;
                tableList += (" " + multiply);
                if (multiply <= 9) tableList += " ";
                else if (multiply <= 16) tableList += "";

            }
            tableList += "|";
        }


        return tableStart + tableList;
    }

    public String tableSquares(int n){

        String shapeStart = "tableSquares()\n*** Output ***\n";
        String shapeList = "";
        int multiply;

        for(int i=1; i <= n; i++){

            shapeList += "\n";

            for(int j =1; j <= n; j++){

                shapeList += "|";
                multiply = i * j;
                //shapeList += (" " + multiply);

                if (multiply <= 9){

                    shapeList += " " + multiply + " ";
                }

                else if (multiply < 100) {
                    shapeList += " " + multiply + "";
                    //shapeList += "";
                }
                else{
                    shapeList += "" + multiply + "";
                }

            }
            shapeList += "|";
        }


        return shapeStart + shapeList;

    }

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println(shape.tableSquares(15));
    }
}
