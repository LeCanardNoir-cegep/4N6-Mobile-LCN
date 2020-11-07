package org.bbtracker.server.model;

import java.util.Date;

/**
 * Created by joris on 15-09-15.
 */
public class MBabyEvent  {

    public Long id;
    public enum Type {Nap30m, Nap1h, Poop, Pee, Drink, Eat}
    public Type type;
    public Date timestamp;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MBabyEvent{");
        sb.append(" ").append(type);
        sb.append(" @ ").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
