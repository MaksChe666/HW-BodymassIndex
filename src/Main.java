public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.75;
        double weight = 85;
        double index = service.calculate(height, weight);
        System.out.println("ИМТ(Индекс Массы Тела) = " + index);


    }
}