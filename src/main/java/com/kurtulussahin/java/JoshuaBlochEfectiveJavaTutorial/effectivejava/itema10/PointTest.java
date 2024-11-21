package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point point1;
    Point point2;
    Point point3;
    @BeforeEach
    void setUp() {
        point1 = new Point(1,2);
        point2 = new Point(1,2);
        point3 = new Point(1,2);
    }
    @Test
    void OverridedEqualsShouldBeReflexive() {
        //reflexive: an object must equal itself x.equals(x)
        assertTrue(point1.equals(point1));
    }

    @Test
    void OverridedEqualsShouldBeSymmetric() {
        //symmetric: x.equals(y) must return the same result as y.equals(x)
        assertEquals(point1.equals(point2), point2.equals(point1));
    }

    @Test
    void OverridedEqualsShouldBeTransitive() {
        //transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
        assertTrue(point1.equals(point2));
        assertTrue(point2.equals(point3));
        assertTrue(point1.equals(point3));
    }

    @Test
    void OverridedEqualsShouldBeConsistent() {
        //consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
        Point point2 = new Point(2,3);
        assertFalse(point1.equals(point2));

    }

    @Test
    void OverridedEqualsShouldReturnFalseComparedToNull() {
        //null control a.equals(null)
        assertFalse(point1.equals(null));

    }

    @Test
    void OverridedHashCodeShouldReturnSame() {

        assertEquals(point1.hashCode(),point2.hashCode());
    }

}