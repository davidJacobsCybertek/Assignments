package Homeworks.Assignment_14;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined" ;

    public TV () {

        System.out.println("Creating TV object using no Args-constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on&&channel>=1&&channel<=120){
            this.channel = channel;
        }else {
            System.out.println( "ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on&&volumeLevel>=1&&volumeLevel<=7){
            this.volumeLevel = volumeLevel;
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void volumeUp(){
        if(on&&volumeLevel>0&&volumeLevel<7){
            volumeLevel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }
    public  void volumeDown(){
        if(on&&volumeLevel>1&&volumeLevel<=7){
            volumeLevel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn(){
        return on;
    }

    public void turnOn(){
        if (on==true){
            System.out.println("Tv is already ON");
        }else {
            on = true;
        }
    }

    public void turnOff(){
        if (on==false){
            System.out.println("Tv is already OFF");
        }else {
            on = false;
        }
    }

    public  void channelDown(){
        if(on&&channel>1&&channel<=120){
            channel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }
    public  void channelUp(){
        if(on&&channel>=1&&channel<120){
            channel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }
    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

}