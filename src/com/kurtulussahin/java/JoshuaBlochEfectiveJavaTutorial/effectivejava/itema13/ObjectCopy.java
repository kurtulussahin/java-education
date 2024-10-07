package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema13;

public class ObjectCopy implements Cloneable {
    String aReferenceVarable;


    public ObjectCopy(String aReferenceVarable) {
        this.aReferenceVarable = aReferenceVarable;
    }

    public String getReferenceVarable() {
        return aReferenceVarable;
    }

    public void setReferenceVariable(String aReferenceVarable) {
        this.aReferenceVarable = aReferenceVarable;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
