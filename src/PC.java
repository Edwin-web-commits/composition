public class PC {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherborad;

    public PC(Case thecase, Monitor monitor, Motherboard motherborad) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherborad = motherborad;
    }
    public void powerUp()
    {
        thecase.pressPowerButton();
        drawLogo();
    }
    public void drawLogo()
    {
        monitor.drawPixel(1500,210,"red");
    }

    /*
    public Case getThecase() {
        return thecase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherborad() {
        return motherborad;
    }
    */

}
