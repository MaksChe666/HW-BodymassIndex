public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double index = service.calculate(height, (int) weight);
        System.out.println("ИМТ(Индекс Массы Тела) = " + Math.round(index));


    }
}