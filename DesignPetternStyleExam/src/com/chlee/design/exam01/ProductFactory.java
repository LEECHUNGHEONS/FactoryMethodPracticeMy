package com.chlee.design.exam01;

import java.util.ArrayList;
import java.util.Collection;
// 제네릭 클래스 적용이 된 팩토리 
// 크레이터 입니다
public class ProductFactory <T extends Product> implements DataProvider<T> {
	
	private Collection<T> products;

    public ProductFactory() {
        products = new ArrayList<>();
    }

    // 제너릭 메서드 적용
    public <P extends T> void addProduct(P product) {
        products.add(product);
    }

	@Override
	public Collection<T> getData() {
		
		return products;
	}
	

}
