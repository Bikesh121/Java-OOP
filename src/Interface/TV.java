package Interface;

interface TvRemote{
    void on();
    void off();
}

interface SmartTvRemote extends TvRemote{
    void openYoutube();
    void playVideo();
}

public class TV implements SmartTvRemote{

    public void openYoutube(){
        System.out.println("Opening youtube...");
    }

    public void playVideo(){
        System.out.println("Playing video...");
    }

    public void on(){
        System.out.println("Turning on TV...");
    }

    public void off(){
        System.out.println("Turning off TV...");
    }

    public static void main(String[] args) {
        SmartTvRemote myRemote = new TV();

        myRemote.on();
        myRemote.openYoutube();
        myRemote.playVideo();
        myRemote.off();
    }
}
