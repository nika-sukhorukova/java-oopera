public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(Show show, String librettoText, String musicAuthor, String choreographer) {
        super(show, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
