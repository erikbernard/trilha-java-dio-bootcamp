public class App {
    public static void main(String[] args){
        SmartTv tv = new SmartTv("Smart TV", "Samsung", "QLED", "4K", "Smart");
        tv.turnOn();
        tv.setChannel(5);
        tv.setVolume(50);
        System.out.println(tv.toString());
    }
}
