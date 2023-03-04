package ex.thisisjava.exam618;

public class ShopService {
	private static ShopService shopService;

	private ShopService() {

	}

//	public static ShopService getInstance() {
//		return shopService;
//	}
	public static ShopService getInstance() {
		if (shopService == null) {
			shopService = new ShopService();
		}
		return shopService;
	}
}
