package com.brownian.trianglenetwork.model;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Some helper functions to work with {@link Connectable} objects generically.
 * Created by Jack on 4/17/2017.
 */
public class ConnectionUtils {
    public static Collection<ConnectionPoint> getExposedConnectionPoints(Connectable connectable){
        return filterConnectionPointsFrom(connectable, ConnectionPoint::isExposed);
    }

    public static Collection<ConnectionPoint> filterConnectionPointsFrom(Connectable connectable, Predicate<ConnectionPoint> predicate){
        return connectable.getConnectionPoints().stream().filter(predicate).collect(Collectors.toList());
    }
}
