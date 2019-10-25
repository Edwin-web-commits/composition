public class Monitor {
    private String manufacture ;
    private String model ;
    private int size ;
    private Resolution nativeResolution;

    public Monitor(String manufacture, String model, int size, Resolution nativeResolution) {
        this.manufacture = manufacture;
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixel(int x, int y,String color)
    { System.out.println("Drawing pixel at " + x + " and "+ y + " in color " + color);
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
