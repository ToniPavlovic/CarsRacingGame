public class Track {
    private final String name;
    private final int laps;

    public Track(String name, int laps){
        this.name = name;
        this.laps = laps;
    }

    public String getName(){
        return name;
    }

    public int getLaps(){
        return laps;
    }

    public String toString(){
        return name + " (" + laps + " laps)";
    }
}
