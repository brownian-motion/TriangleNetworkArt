package com.brownian.trianglenetwork.model;

import com.sun.istack.internal.NotNull;
import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a {@link Triangle} with {@link ConnectionPoint ConnectionPoints}.
 * Created by Jack on 4/17/2017.
 */
public class ConnectableTriangle extends Triangle implements Connectable{
    private Collection<ConnectionPoint>  connectionPoints;

    /**
     * Creates a {@link Triangle} with {@link ConnectionPoint ConnectionPoints} on the midpoints of its sides.
     * @param corners three {@link Point2D points} indicating the corners of the triangle.
     */
    public ConnectableTriangle(@NotNull Point2D ... corners){
        super(corners);
        connectionPoints = new ArrayList<>(3);
        connectionPoints.add(new ConnectionPoint(corners[0].midpoint(corners[1]), this));
        connectionPoints.add(new ConnectionPoint(corners[1].midpoint(corners[2]), this));
        connectionPoints.add(new ConnectionPoint(corners[2].midpoint(corners[0]), this));
    }

    @Override
    public Collection<ConnectionPoint> getConnectionPoints(){
        return connectionPoints;
    }
}
