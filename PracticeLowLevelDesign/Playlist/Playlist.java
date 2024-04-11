package PracticeLowLevelDesign.Playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // You'll code addSong, removeSong, and playAll methods here
    // addSong(), removeSong(), playAll()
    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void playAll() {
        for (Song song : songs) {
            System.out.println("The song is Playing " +song.getTitle()+" And the artist is "+song.getArtist()+" Durations is "+song.getDuration());
        }
    }
}
