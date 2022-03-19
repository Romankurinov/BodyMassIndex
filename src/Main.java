public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        float weight = 63.0F;
        float height = 174.0F;
        float bodyMassIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}