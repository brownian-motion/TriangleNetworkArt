package com.brownian.trianglenetwork.model;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collection;

/**
 * Represents a single line connecting two {@link Triangle triangles}.
 * A connector is composed of exactly two {@link ConnectionPoint endpoints}.
 * Created by Jack on 4/17/2017.
 */
public class Connector implements Connectable{
    private Collection<ConnectionPoint> connectionPoints;

//    /**
//     * Creates a {@link Connector} attached to default-initialized {@link ConnectionPoint ConnectionPoints}.
//     */
//    public Connector(){
//        this(new ConnectionPoint(), new ConnectionPoint());
//    }
//
//    /**
//     * Creates a {@link Connector} attached to the specified {@link ConnectionPoint} and a default-initialized one.
//     * @param existingConnectionPoint a {@link ConnectionPoint} to attach the new {@link Connector} to
//     */
//    public Connector(@NotNull ConnectionPoint existingConnectionPoint){
//        this(existingConnectionPoint, new ConnectionPoint());
//    }

    /**
     * Creates a {@link Connector} attached to the specified {@link ConnectionPoint ConnectionPoints}.
     * @param firstExistingConnectionPoint a {@link ConnectionPoint} to attach the new {@link Connector} to
     * @param secondExistingConnectionPoint a {@link ConnectionPoint} to attach the new {@link Connector} to
     * @throws IllegalArgumentException if the same point is provided for both arguments
     */
    public Connector(@NotNull ConnectionPoint firstExistingConnectionPoint, @NotNull ConnectionPoint secondExistingConnectionPoint){
        if(firstExistingConnectionPoint == secondExistingConnectionPoint)
            throw new IllegalArgumentException("This Connector cannot attach to the same point on both ends.");
        connectionPoints = Arrays.asList(firstExistingConnectionPoint, secondExistingConnectionPoint);
        firstExistingConnectionPoint.setConnector(this);
        secondExistingConnectionPoint.setConnector(this);
    }

    /**
     * Returns a collection containing the {@link ConnectionPoint ConnectionPoints} this {@link Connector}
     * is attached to.
     * @return a collection containing the same {@link ConnectionPoint ConnectionPoints} this object connects to.
     */
    @Override
    public Collection<ConnectionPoint> getConnectionPoints(){
        return connectionPoints;
    }
}
