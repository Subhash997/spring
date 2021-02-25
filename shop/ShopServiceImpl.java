package com.xworkz.shop;

public class ShopServiceImpl  implements ShopService{
	
	private ShopDAO shopDao;
	
	
	
	

	public ShopServiceImpl(ShopDAO shopDao) {
		super();
		System.out.println("created"+this.getClass().getSimpleName());
		this.shopDao = shopDao;
	}





	@Override
	public boolean validation(ShopDTO shopDto) {
		
		System.out.println("validation invoked");
		System.out.println("ShopDto"+shopDto);
		
		 String shopName=shopDto.getShopName();
		 String shopLocation=shopDto.getShopLocation();
         String	ownerName=shopDto.getOwnerName();
         
         Open open=shopDto.getOpen();
         
     	boolean valid = false;
		
		
		
		
     	
     	
    	if (shopDto != null) {
			if (shopName!= null && !shopName.isEmpty() && shopName.length() > 3 && shopName.length() <= 32) {
				System.out.println("shop name is valid");
				valid = true;
			} else {
				System.out.println(
						"shop name is invalid, please enter minimum 3 charecters or maximum 12charecters and it should not be empty");
				valid = false;
			}
			if (valid) {
				if (shopLocation != null && shopLocation.length()>3 && shopLocation.length()<=12) {
					System.out.println("shopLocation is valid");
					valid = true;

				} else {
					System.out.println("shopLocation is invalid, please enter min 3 chracters max 12");
					valid = false;
				}
				if (valid) {
					if (ownerName !=null  && ownerName.length()>4  && ownerName.length()<=12) {
						System.out.println("ownerName is valid");
						valid = true;
					} else {
						System.out.println("ownerName should be within 4to 12");
						valid = false;
					}
					if (valid) {
						if (open!= null) {
							System.out.println("open is valid");
							valid = true;
						} else {
							System.out.println("open can not be null");
							valid = false;
						}
					
						}
					}
				}

			else {
				System.out.println("create a shopdto properly");
			}if(valid) {
				System.out.println("shop is valid, can save");
				shopDao.saveShop((shopDto));
			} else {
				System.out.println("Shop is invalid cant save");
			}

    	}		
	

			

return valid;
		
		
	}

}	
		