public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(Show show, String librettoText, String musicAuthor, int choirSize) {
        super(show, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
