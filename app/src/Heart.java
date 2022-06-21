public class Heart extends Organe {
    private int heartRate;
    public Heart(String name, String medicalCondition,int heartRate){
        super(name, medicalCondition);
        this.heartRate= heartRate;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

}
