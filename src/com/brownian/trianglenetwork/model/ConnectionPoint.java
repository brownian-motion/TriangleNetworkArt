package com.brownian.trianglenetwork.model;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * Represents the point at which a {@link Connector} is attached to a {@link ConnectableTriangle}.
 * Is composed of a {@link Point2D} representing its location in the model,
 * a {@link Connector} attached to it, and optionally a {@link ConnectableTriangle} attached to it.
 * A {@link ConnectionPoint} attached to a {@link ConnectableTriangle} is said to be "exposed" if it
 * is not attached to a {@link Triangle}.
 * This class is used to abstract away the notion of exposure from {@link Connector Connectors}.
 * Created by Jack on 4/17/2017.
 */
public class ConnectionPoint {
    private ConnectableTriangle triangle;
    private Connector connector;
    private Point2D point2D;

    public ConnectionPoint(){
        this (null, null, null);
    }

    public ConnectionPoint(Point2D point2D, Connector connector){
        this(point2D, connector, null);
    }

    public ConnectionPoint(Point2D point2D, ConnectableTriangle triangle){
        this(point2D, null, triangle);
    }

    public ConnectionPoint(Point2D point2D, @Nullable Connector connector, @Nullable ConnectableTriangle triangle){
        this.triangle = triangle;
        this.connector = connector;
        this.point2D = point2D;
    }

    @Nullable
    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(ConnectableTriangle triangle) {
        this.triangle = triangle;
    }

    @Nullable
    public Connector getConnector() {
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(@NotNull Point2D point2D) {
        this.point2D = point2D;
    }

    public boolean isExposed(){
        return isExposedToTriangle() || isExposedToConnector();
    }

    public boolean isExposedToTriangle(){
        return triangle == null;
    }

    public boolean isExposedToConnector(){
        return connector == null;
    }
}
