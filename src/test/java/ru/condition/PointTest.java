package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to21then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when501to31then47() {
        double expected = 47;
        int x1 = 50;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when508to594then97Dot06() {
        double expected = 97.06;
        int x1 = 50;
        int y1 = 8;
        int x2 = 5;
        int y2 = 94;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}