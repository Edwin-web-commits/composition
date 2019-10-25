public class Main {
    public static void main(String[] args) {
        Motherboard motherboard=new Motherboard("Intel","2000 mod",4,2,"10Mic");
        Dimensions dims=new Dimensions(5,10,15);
        Resolution res=new Resolution(10,12);
        Case cAse=new Case("Intel core2008","Intel",dims,"40W");
        Monitor monitor=new Monitor("HP","hp2000",32,res);
        PC pc=new PC(cAse,monitor,motherboard);

        cAse.pressPowerButton();
        pc.drawLogo();
        motherboard.program("Microsoft Windows");
    }
}
