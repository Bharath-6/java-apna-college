package PracticeLowLevelDesign.Playlist;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Shape of You", "Ed Sheeran", 234);
        Song song2 = new Song("Someone Like You", "Adele", 289);

        Playlist playlist = new Playlist("My Playlist");

        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.playAll();
    }
}

