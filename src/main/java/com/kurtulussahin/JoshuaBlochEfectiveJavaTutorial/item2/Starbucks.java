package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item2;

public class Starbucks {

    // Gerekli
    private String size;

    // Seçime göre değişir
    private String milkType;
    private String beanType;


    public static class StarbucksBuilder {

        // Gerekli
        private final String size;

        // Seçime göre değişir
        private String milkType;
        private String beanType;


        public StarbucksBuilder(String size) {
            super();
            this.size = size;
        }

        public StarbucksBuilder buildMilk(String milkType) {
            this.milkType = milkType;
            return this;
        }

        public StarbucksBuilder buildBeanType(String beanType) {
            this.beanType = beanType;
            return this;
        }


        public Starbucks build() {
            return new Starbucks(this);
        }

    }

    public Starbucks(StarbucksBuilder starbucksBuilder) {
        // TODO Auto-generated constructor stub
        size = starbucksBuilder.size;
        milkType = starbucksBuilder.milkType;
        beanType = starbucksBuilder.beanType;

    }

	public String getMilkType() {
		return milkType;
	}

	public String getBeanType() {
		return beanType;
	}

	public String getSize() {
		return size;
	}
}
