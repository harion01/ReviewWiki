package copilotTrain;

/*Task
Given the meal price (base cost of a meal),
tip percent (the percentage of the meal price being added as tip),
and tax percent (the percentage of the meal price being added as tax) for a meal,
find and print the meal's total cost. Round the result to the nearest integer.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day2 {
    public void Solution(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        this.calculatePrice(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }

    //calculate price based on given meal cost, tip percent, and tax percent
    //cost = mealCost
    //tip = mealCost * (tipPercent / 100)
    //tax = mealCost * (taxPercent / 100)
    public int calculatePrice(double mealCost, int tipPercent, int taxPercent) {
        double tip = (mealCost * tipPercent) / 100.0;
        double tax = (mealCost * taxPercent) / 100.0;
        double total = Math.round(mealCost + tip + tax);
        return (int) total;
    }

}
