import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;

    private ArrayList<Actor> actors;

    public Show(String title, double duration, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Актёры спектакля " + title + ":");
        for (Actor a : actors) {
            System.out.println(a);
        }
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Предупреждение: актёр " + actor + " уже есть в спектакле " + title + ".");
        } else {
            actors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (actors.contains(newActor)) {
            System.out.println("Предупреждение: актёр " + newActor + " уже есть в спектакле " + title + ".");
            return;
        }
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getSurname().equals(surnameToReplace)) {
                actors.set(i, newActor);
                return;
            }
        }
        System.out.println("Предупреждение: актёр с фамилией " + surnameToReplace + " не найден в спектакле " + title + ".");
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + ", длительность: " + duration;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
