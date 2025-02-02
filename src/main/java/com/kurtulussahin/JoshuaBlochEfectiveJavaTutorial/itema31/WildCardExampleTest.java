package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema31;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WildCardExampleTest {
    List<A> listwildCardNewA = new ArrayList<A>();
    List<B> listwildCardNewB = new ArrayList<B>();
    List<C> listwildCardNewC = new ArrayList<C>();
    List<D> listwildCardNewD = new ArrayList<D>();

    @Test
    void shouldWildCardExtends() {

        //Compile Error. A Dont extends B
            //WildCardExample.wildCardExtends(listwildCardNewA);

        WildCardExample.wildCardExtends(listwildCardNewB);
        WildCardExample.wildCardExtends(listwildCardNewC);
        WildCardExample.wildCardExtends(listwildCardNewD);
    }

    @Test
    void shouldWildCardSuper() {

        //Compile Error. A Dont extends B

        WildCardExample.wildCardSuper(listwildCardNewA);
        WildCardExample.wildCardSuper(listwildCardNewB);

        //Compile Error. C or D Dont super of B
            //WildCardExample.wildCardSuper(listwildCardNewC);
            //WildCardExample.wildCardSuper(listwildCardNewD);

    }
}