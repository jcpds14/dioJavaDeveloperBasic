public class SmartTv {
    boolean isOn = false;
    int volume = 25;
    int channel = 1;

    public void changeChannel(int channel){
        this.channel = channel;
    }
    public void setChannelUp(){
        channel++;
    }
    public void setChannelDown(){
        channel--;
    }

    public void setVolumeUp(){
        volume++;
    }
    public void setVolumeDown(){
        volume--;
    }

    public void setOn(){
        isOn = true;
    }
    public void setOff(){
        isOn = false;
    }
}