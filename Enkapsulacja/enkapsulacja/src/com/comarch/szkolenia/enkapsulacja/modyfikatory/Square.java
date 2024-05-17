package com.comarch.szkolenia.enkapsulacja.modyfikatory;

public class Square {
    private int side;
    private int field;
    private int circle;

    public Square() {
    }

    public Square(int side, int field, int circle) {
        this.side = side;
        this.field = field;
        this.circle = circle;
    }

    public int getSide(){
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircle() {
        return this.circle;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = 4 * side;
    }
}
