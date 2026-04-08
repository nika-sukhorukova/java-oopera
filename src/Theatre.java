import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        //актеры
        Actor actor1 = new Actor("Дмитрий", "Жиглов", Gender.MALE, 182.0);
        Actor actor2 = new Actor("Алина", "Котова", Gender.FEMALE, 165.0);
        Actor actor3 = new Actor("Степан", "Ефонтов", Gender.MALE, 175.0);
        //режиссер
        Director director1 = new Director("Михаил", "Лось", Gender.MALE, 42);
        Director director2 = new Director("Галина", "Травина", Gender.FEMALE, 38);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Дмитрий Плясунов";

        // спектакли

        ArrayList<Actor> playActors = new ArrayList<>();
        Show play = new Show("Хождение по мукам", 120, director1, playActors);
        play.addActor(actor1);
        play.addActor(actor2);

        ArrayList<Actor> operaActors = new ArrayList<>();
        Show operaBase = new Show("Травиата", 150, director2, operaActors);
        Opera opera = new Opera(operaBase, "Либретто оперы Травиата: история Виолетты...", musicAuthor, 30);
        opera.addActor(actor2);
        opera.addActor(actor3);

        ArrayList<Actor> balletActors = new ArrayList<>();
        Show balletBase = new Show("Лебединое озеро", 140, director1, balletActors);
        Ballet ballet = new Ballet(balletBase, "Либретто балета Лебединое озеро: принц Зигфрид встречает заколдованную принцессу...", musicAuthor, choreographer);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        //действия с актерами
        System.out.println("Aктерский состав");
        play.printActors();
        opera.printActors();
        ballet.printActors();

        opera.replaceActor(actor1, "Козлов");
        opera.printActors();

        ballet.replaceActor(actor2, "Мистерикс");
        play.addActor(actor1);

        // действия со спектаклями
        opera.printLibretto();
        ballet.printLibretto();

        //режиссёры
        System.out.println("Режиссёры");
        play.printDirector();
        opera.printDirector();
        ballet.printDirector();
    }
}