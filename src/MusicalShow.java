public class MusicalShow extends Show{
    private String librettoText;
    private Person musicAuthor;


    public MusicalShow(Show show, String librettoText, Person musicAuthor) {
        super(show.getTitle(), show.getDuration(), show.getDirector(), show.getActors());
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля " + getTitle() + ":");
        System.out.println(librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
