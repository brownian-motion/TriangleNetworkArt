package com.brownian.trianglenetwork.model;

import java.util.Collection;

/**
 * An abstraction to separate the concept of a shape from the concept of connection in the animation's network.
 * Created by Jack on 4/17/2017.
 */
public interface Connectable {
    Collection<ConnectionPoint> getConnectionPoints();
}
