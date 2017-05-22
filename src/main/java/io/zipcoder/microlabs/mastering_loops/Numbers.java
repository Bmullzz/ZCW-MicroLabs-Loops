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

        String numStart = "even()\n*** Output ***\n";
        String numList = "";

        for (int i = 2; i <= n-2; i+=2){

            if(i < n-2){
                numList = numList + Integer.toString(i) + "\n";
            }
            else{
                numList = numList + Integer.toString(i);
            }

        }

        return numStart + numList;
    }

    public String powers(int n) {

        String numStart = "powers()\n*** Output ***\n";
        String numList = "";

        for (double i = 1; i <= n; i++){

            if(i < n){
                numList = numList + Double.toString(Math.pow(2,i)) + "\n";
            }
            else{
                numList = numList + Double.toString(Math.pow(2,i));
            }

        }

        return numStart + numList.replace(".0", "");
    }

    static String electionWinner(String[] votes) {

        Map<String, Integer> voteMap = new HashMap<>();
        int max = 0;

        for (String vote: votes) {

            if (voteMap.get(vote) == null) voteMap.put(vote, 1);

            else {

                int count = voteMap.get(vote)+1;
                voteMap.put(vote, count);
                max = Math.max(max, count);

            }

        }
        List<String> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: voteMap.entrySet()) {
            if (entry.getValue() == max) results.add(entry.getKey());
        }
        Collections.sort(results);
        return results.get(results.size()-1);

    }


    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        System.out.print(numbers.powers(8));
    }
}




