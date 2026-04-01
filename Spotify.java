class Spotify {
    String songName;
    String artist;
    double duration;

    public Spotify() {}

    public Spotify(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
    }

    public void display() {
        System.out.println(songName);
        System.out.println(artist);
        System.out.println(duration);
        System.out.println("-------------------");
    }
}