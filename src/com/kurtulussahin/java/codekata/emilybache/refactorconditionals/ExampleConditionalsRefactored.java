package com.kurtulussahin.java.codekata.emilybache.refactorconditionals;

public class ExampleConditionalsRefactored {

	static int invert(int x) {
        if (x == 3) {
            return 4;
        } else {
            return 3;
        }
    }

	static int redundant_else(int x) {
		if (x < 3) {
			return 1;
		}
        if (x < 10) {
            return 10;
        }
        if (x < 30) {
			return 30;
		}
		return 0;
	}

	static boolean deMorgan(int x) {
		return x == 5 || x == 7;
	}

	static int join_AND(int x, int y) {
        if (x == 3 && y == 4) {
            return x + y;
        }
		return 0;
	}

	static int split_AND(int x, int y) {
        if (x == 3) {
            if (y == 4) {
                return x + y;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
	}

	static boolean join_OR(int x, int y) {
        if (x >= 0 || y <= 3) {
            return true;
        }
        return y == 10;
	}

	static boolean split_OR(int x, int y) {
        if (x >= 0) {
            return true;
        } else if (y <= 3) {
            return true;
        } else if (y == 10) {
            return true;
        }
		return false;
	}

	static int join_statements(int x, int y) {
		int result = 0;
		int factor = 1;
        if (x > 3) {
            factor = x;

            result += y * 3;
        }
        return result * factor;
	}

	static int split_statements(int x, int y) {
		int result = 0;
		int factor = 1;
		if (x > 3) {
			result += y * 3;
		}
		if (x > 3) {
			factor = x;
		}
		return result * factor;
	}
}
