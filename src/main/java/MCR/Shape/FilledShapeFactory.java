package MCR.Shape;

import MCR.Shape.Circle.FilledCircle;
import MCR.Shape.Square.FilledSquare;

import java.util.LinkedList;

public class FilledShapeFactory implements ShapeFactory {
    @Override
    public LinkedList<Bounceable> createSquares() {
        LinkedList<Bounceable> squares = new LinkedList<>();
        for (int i = 1; i <= COUNT; i++) {
            squares.add(new FilledSquare());
        }
        return squares;
    }

    @Override
    public LinkedList<Bounceable> createCircles() {
        LinkedList<Bounceable> circles = new LinkedList<>();
        for (int i = 1; i <= COUNT; i++) {
            circles.add(new FilledCircle());
        }
        return circles;
    }
}






