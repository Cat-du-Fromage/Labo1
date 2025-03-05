package MCR.Shape;

import java.util.LinkedList;

interface ShapeFactory {
    int COUNT = 10;
    LinkedList<Bounceable> createSquares();
    LinkedList<Bounceable> createCircles();
}
