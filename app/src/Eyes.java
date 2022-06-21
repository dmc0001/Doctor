public class Eyes extends Organe {
    private String color;

    Eyes(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public void CloseEye() {
        System.out.println("1.Close the Eye");
    }

    public String getColor() {
        return this.color;
    }
    
}
