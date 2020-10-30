package com.rakovets.course.javabasics.list;

import java.util.Set;
import java.util.TreeSet;

public class Studio {

    private Set<Actor> actors = new TreeSet<>(); // Set - интерфейс, создали коллекцию Treeset(реализации)


    public void fire(Set<Actor> actors) {
        Actor[] actorsArray = actors.toArray(new Actor[actors.size()]);
        Actor actorWithMaxFee = actorsArray[0];

        for (int i = 0; i < actorsArray.length; i++) {
            this.actors.add(actorsArray[i]);
            if (actorsArray[i].getFee() > actorWithMaxFee.getFee()) {
                actorWithMaxFee = actorsArray[i];
            }
        }
        this.actors.remove(actorWithMaxFee);
    }
}
