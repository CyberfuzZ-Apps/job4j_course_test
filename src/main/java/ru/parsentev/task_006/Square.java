package ru.parsentev.task_006;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Реализовать класс квадрат основанный на четырех точках Point(x, y).
 * boolean exists() - проверяет существует ли квадрат или нет.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public boolean exists() {
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(fourth);
        double d = fourth.distanceTo(first);
        return a == b && b == c && c == d && d == a;
    }
}
