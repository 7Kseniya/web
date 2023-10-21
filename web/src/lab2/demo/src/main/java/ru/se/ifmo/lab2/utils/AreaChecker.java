package ru.se.ifmo.lab2.utils;

import ru.se.ifmo.lab2.data.ResultRow;

import java.time.LocalDateTime;

public class AreaChecker {
    public ResultRow formNewTableRow(float x, float y, float r, LocalDateTime currentTime) {
        long startTime = System.currentTimeMillis();
        boolean isHit = check_circle(x, y, r) || check_rectangle(x, y, r) || check_triangle(x, y, r);
        double executionTime = System.currentTimeMillis() - startTime;

        return new ResultRow(x, y, r, isHit, currentTime, executionTime);
    }
    private boolean check_circle(float x, float y, float r) {
        return x >= 0 && y >= 0 && (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2));
    }

    private boolean check_rectangle(float x, float y, float r) {
        return x <= 0 && y >= 0 && x >= -r &&  y <= r;
    }

    private boolean check_triangle(float x, float y, float r) {
        return x >= 0 && y <= 0 && x<=r/2 && y>=-r/2 && Math.abs(x - y) <= r/2;
    }
}
