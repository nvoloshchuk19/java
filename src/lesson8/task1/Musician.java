package lesson8.task1;

public class Musician implements Drums, Piano, Violin {
    @Override
    public String playDrums() {
        return "Plays drums";
    }

    @Override
    public String playPiano() {
        return "Plays piano";
    }

    @Override
    public String playViolin() {
        return "Plays violin";
    }
}
