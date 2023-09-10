public class SmartTv{
    boolean isOn;
    int channel;
    int volume;
    String name;
    String brand;
    String model;
    String resolution;
    String type;

    public SmartTv(String name, String brand, String model, String resolution, String type){
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.type = type;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void printStatus(){
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Type: " + type);
        System.out.println("Is On: " + isOn);
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
    }

    @Override
    public String toString() {
        return "SmartTv \nbrand: " + brand + "\nchannel: " + channel + "\nisOn: " + isOn + "\nmodel: " + model + "\nname: "
                + name + "\nresolution: " + resolution + "\ntype: " + type + "\nvolume: " + volume;
    }



}