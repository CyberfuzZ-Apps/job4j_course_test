package ru.parsentev.task_008;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_007.Expression;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */

public class PrimesTest {
    @Test
    public void calc() {
        Primes primes = new Primes(3);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3)));
    }

    @Test
    public void calc5() {
        Primes primes = new Primes(5);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5)));
    }

    @Test
    public void calc7() {
        Primes primes = new Primes(7);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5, 7)));
    }
}
