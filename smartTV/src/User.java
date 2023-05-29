public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.isOn);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.setOn();
        System.out.println("Tv Ligada? " + smartTv.isOn);

        smartTv.setVolumeUp();
        smartTv.setVolumeUp();
        smartTv.setVolumeUp();
        smartTv.setVolumeDown();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.changeChannel(13);
        System.out.println("Canal atual: " + smartTv.channel);

    }
}