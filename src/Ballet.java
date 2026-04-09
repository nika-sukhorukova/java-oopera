public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(Show show, String librettoText, Person musicAuthor, Person choreographer) {
        super(show, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
