package MCR.Shape;

import MCR.Shape.Circle.*;
import MCR.Shape.Square.*;

import java.util.LinkedList;

public class EmptyShapeFactory implements ShapeFactory {
    @Override
    public LinkedList<Bounceable> createSquares() {
        LinkedList <Bounceable> squares = new LinkedList<>();
        for (int i = 0; i < COUNT; i++) {
           squares.add(new EmptySquare());
        }
        return squares;
    }

    @Override
    public LinkedList<Bounceable> createCircles() {
        LinkedList <Bounceable> circles = new LinkedList<>();
        for (int i = 0; i < COUNT; i++) {
            circles.add(new EmptyCircle());
        }
        return circles;
    }
}
