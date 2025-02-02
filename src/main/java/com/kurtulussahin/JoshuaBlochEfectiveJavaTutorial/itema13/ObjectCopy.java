package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema13;

public class ObjectCopy implements Cloneable {
    public String aReferenceVarable;
    public String[] anArray;

    public ObjectCopy(String aReferenceVarable) {
        this.aReferenceVarable = aReferenceVarable;
    }
    public ObjectCopy(String aReferenceVarable, String[] anArray) {
        this.aReferenceVarable = aReferenceVarable;
        this.anArray=anArray;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
