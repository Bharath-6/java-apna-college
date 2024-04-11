package PracticeLowLevelDesign.Playlist;

public class Song {
    private String title;
    private String artist;
    private int duration; // in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // You'll code the play method here
    // play()
    public void play(){
        System.out.println("The song is playing and song name is "+title+" And the artist is "+artist+"Duration is "+duration);
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getDuration(){
        return duration;
    }
}

