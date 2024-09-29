package com.kurtulussahin.java.codekata.robertcmartin.knuthprimegenerator.refactored;

class NumberPrinter {
	
	private int linesPerPage;
	private int colums;
	
	public NumberPrinter(int linesPerPage, int colums) {
		this.linesPerPage=linesPerPage;
		this.colums=colums;

	}

	public void print(int[] numbers, int numberOfNumbers) {
		int pagemumber = 1;
		int pageoffset = 1;
		while (pageoffset <= numberOfNumbers) {
			System.out.print("The First ");
			System.out.print(Integer.toString(numberOfNumbers));
			System.out.print(" Prime Numbers --- Page ");
			System.out.print(Integer.toString(pagemumber));
			System.out.print("\n");
			for (int rowoffset = pageoffset; rowoffset <= pageoffset + linesPerPage - 1; rowoffset++) {
				for (int column = 0; column <= colums - 1; column++)
					if (rowoffset + column * linesPerPage <= numberOfNumbers)
						System.out.printf("%10d", numbers[rowoffset + column * linesPerPage]);
				System.out.println();
			}
			System.out.println("\f");
			pagemumber++;
			pageoffset += linesPerPage * colums;
		}
	}
}
