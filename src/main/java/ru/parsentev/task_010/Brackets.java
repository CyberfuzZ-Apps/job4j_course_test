package ru.parsentev.task_010;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        if (line.charAt(0) != '('
                || line.charAt(line.length() - 1) != ')') {
            return false;
        }
        int open = 0;
        int close = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ')') {
                open++;
            } else {
                close++;
            }
        }
        return open == close;
    }
}
