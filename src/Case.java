public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacture, Dimensions dimension,String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.dimension = dimension;
        this.powerSupply=powerSupply;
    }
    public void pressPowerButton()
    {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Dimensions getDimension() {
        return dimension;
    }
    public String getPowerSupply()
    { return powerSupply;
    }
}
