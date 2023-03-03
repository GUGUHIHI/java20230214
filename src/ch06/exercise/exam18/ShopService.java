package ch06.exercise.exam18;

public class ShopService {
	public static ShopService shopservice = new ShopService();

	private ShopService() {

	}

	public static ShopService getInstance() {

		return shopservice;

	}
}
