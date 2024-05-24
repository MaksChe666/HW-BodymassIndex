public class BmiService {
    public double calculate(double height, int weight) {
    double bmi = weight / (height * 2);
    return bmi;

    }
}
