package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectCopyTest {
    ObjectCopy object1;
    ObjectCopy object2;
    @BeforeEach
    void setUp() {
        object1 = new ObjectCopy("x");
        object2 = new ObjectCopy("y");
    }

    @Test
    void referanceCopyTurnsTrueEqualityOperator() {

        object2=object1;
        assertTrue(object1==object2);
    }

    @Test
    void shallowCopyTurnsFalseEqualityOperator() throws CloneNotSupportedException {

        object2= (ObjectCopy) object1.clone();

        assertFalse(object1==object2);
    }

    @Test
    void shallowCopyTurnsTrueForInstanceVariableEqualityOperator() throws CloneNotSupportedException {

        object2= (ObjectCopy) object1.clone();

        assertTrue(object1.getReferenceVarable()==object2.getReferenceVarable());
    }

    @Test
    void shallowCopyTurnsFalseForOneOfInstanceVariableNullEqualityOperator() throws CloneNotSupportedException {

        object2= (ObjectCopy) object1.clone();

        object2.setReferenceVariable(null);
        assertFalse(object1.getReferenceVarable()==object2.getReferenceVarable());
    }

    @Test
    void shallowCopyTurnsFalseForOneOfInstanceVariableChangeEqualityOperator() throws CloneNotSupportedException {

        object2= (ObjectCopy) object1.clone();
        assertTrue(object1.getReferenceVarable()==object2.getReferenceVarable());
        object2.setReferenceVariable("z");
        assertFalse(object1.getReferenceVarable()==object2.getReferenceVarable());
    }

}