package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema10;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*  Equals method should be:

		reflexive: an object must equal itself x.equals(x)
		symmetric: x.equals(y) must return the same result as y.equals(x)
		transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
		consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
		null control a.equals(null)
		*/
	@Override
	public boolean equals(Object o) {

		//reflexive
		if (o == this) {
			return true;
		}

		//symmetric
		if (!(o instanceof Point)) {
            return false;
        }

		Point p = (Point) o;

		//transitive, //consistent
		return p.x == this.x && p.y == this.y;
	}

//    // Broken - violates Liskov substitution principle (page 43)
//    @Override public boolean equals(Object o) {
//        if (o == null || o.getClass() != getClass())
//            return false;
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

	// See Item 11
	@Override
	public int hashCode() {
		int result = Integer.hashCode(x);
		result = 31*result + Integer.hashCode(y);
		return result;
	}
}