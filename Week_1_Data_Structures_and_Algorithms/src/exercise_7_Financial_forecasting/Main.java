package exercise_7_Financial_forecasting;

public class Main {
    public static void main(String[] args){
        int money = 1000;
        double rate = 0.10;
        int duration = 5;

        double returnValue = Predict.predict(money, rate, duration);


        System.out.println("The returnValue of " + money +" with rate "+rate+" in " +duration+ " will be: " +returnValue);
    }
}
