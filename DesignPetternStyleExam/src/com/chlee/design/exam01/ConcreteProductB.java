package com.chlee.design.exam01;

// 콘크리트 클래스
public class ConcreteProductB implements Product {
	private String name;

    public ConcreteProductB(String name) {
        this.name = name;
    }

	@Override
	public void printInfo() {
		System.out.println("Product B: " + name);
		
	}


}
