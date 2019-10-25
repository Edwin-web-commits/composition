public class Motherboard {
    private String manufacture;
    private String model ;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String manufacture, String model, int ramSlots, int cardSlots, String bios) {
        this.manufacture = manufacture;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void program(String programName)
    {
        System.out.println("Program " + programName +" is now loading");
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
