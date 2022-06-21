abstract public class Organe  {
    private String name;
    private String medicalCondition;


    public Organe(String name, String medicalCondition ) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }
   


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return this.medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }


   
    
    
}
