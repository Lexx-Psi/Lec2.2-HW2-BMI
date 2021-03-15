public class BMIService {
    public float calculate(float height, float weight) {
        float bmi = weight/(height * height);
        return ((float)bmi);
    }
}
