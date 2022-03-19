public class BmiService {
    public float calculate(float weight, float height) {
        return weight * 10_000 / height / height;
    }
}
