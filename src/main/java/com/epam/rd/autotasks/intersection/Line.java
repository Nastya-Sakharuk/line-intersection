package com.epam.rd.autotasks.intersection;

public class Line {
    int k;
    int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line line) {
        if (this.k == line.k && this.b != line.b) {
            return null;
        } else if (this.k == line.k && this.b == line.b) {
            return null;
        } else {
            int x = (line.b - this.b) / (this.k - line.k);
            int y = this.k * ((line.b - this.b) / (this.k - line.k)) + this.b;
            return new Point(x, y);
        }
    }

}
