interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface Gps {
    void getLocation();
}

class Smartphone implements Camera, MusicPlayer, Gps {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music.");
    }

    @Override
    public void getLocation() {
        System.out.println("Smartphone detects the location.");
    }

    public void makeCall() {
        System.out.println("Smartphone makes a call.");
    }
}

public class Main {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
        phone.getLocation();
        phone.makeCall();
    }
}