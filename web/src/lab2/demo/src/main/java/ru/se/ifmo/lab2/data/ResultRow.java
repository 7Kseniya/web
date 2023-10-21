package ru.se.ifmo.lab2.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public final class ResultRow implements Serializable {
    private final float x;
    private final float y;
    private final float r;
    private final boolean hit;
    private final LocalDateTime currentTime;
    private final double executionTime;

    public ResultRow(float x, float y, float r, boolean hit, LocalDateTime currentTime, double executionTime) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.hit = hit;
        this.currentTime = currentTime;
        this.executionTime = executionTime;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getR() {
        return r;
    }

    public boolean isHit() {
        return hit;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public double getExecutionTime() {
        return executionTime;
    }
}