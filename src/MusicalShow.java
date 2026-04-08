public class MusicalShow extends Show{
    private String librettoText;
    private String musicAuthor;


    public MusicalShow(Show show, String librettoText, String musicAuthor) {
        super(show.getTitle(), show.getDuration(), show.getDirector(), show.getActors());
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля " + getTitle() + ":");
        System.out.println(librettoText);
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
