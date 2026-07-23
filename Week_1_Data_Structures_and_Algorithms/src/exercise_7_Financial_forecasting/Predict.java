package exercise_7_Financial_forecasting;

public class Predict {
    public static double predict(int money, double rate, int duration) {
        if (duration == 0) {
            return money;
        }


        double returnValue = (1 + rate) * predict(money, rate, duration - 1);
        return returnValue;
    }
}
