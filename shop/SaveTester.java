package com.xworkz.shop;

public class SaveTester {
	public static void main(String[] args) {
		ShopDTO shopdata = new ShopDTO(1, "abc", "bangalore", "xyz", Open.True);
		ShopDAO impl = new ShopDAOImpl();
		impl.saveShop(shopdata);
	}
}