package com.brownian.trianglenetwork.model;

import com.sun.istack.internal.NotNull;
import javafx.geometry.Point2D;


/**
 * A lightweight container that represents a single triangle in the animation.
 * A triangle has three corners.
 *
 * //TODO: Extend the {@link javafx.geometry.Bounds} class
 * Created by Jack on 4/17/2017.
 */
public class Triangle {
    private Point2D[] corners;

    /**
     * Creates a {@link Triangle} with the specified corners.
     * @param corners the three corners of this triangle
     */
    public Triangle(@NotNull Point2D ... corners){
        if(corners.length != 3)
            throw new IllegalArgumentException("A Triangle must have 3 corners.");
        this.corners = corners;
    }

    /**
     * Returns an array with the corners of the triangle
     * @return the corners of the {@link Triangle}
     */
    Point2D[] getCorners(){
        return corners;
    }

}
