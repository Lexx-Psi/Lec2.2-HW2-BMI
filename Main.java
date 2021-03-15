public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        float height = (float) 1.85;
        float weight = 95;
        float bmi = service.calculate (height, weight);
        System.out.println(bmi);
    }
}
