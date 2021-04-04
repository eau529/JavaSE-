/**
 * <p>Title: Home_Test.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class Home_Test {
	public static void main(String[] args) {
		Home_Mcbean hm1=new Home_Mcbean("1001","手机",1000,"耐摔");
		Home_Mcbean hm2=new Home_Mcbean("1002","手机壳",10,"好看");
		Home_Mcbean hm3=new Home_Mcbean("1003","充电宝",100,"小巧");
		Home_Mcbean hm4=new Home_Mcbean("1004","耳机",1500,"Hifi音质");
		
		Home_ShoppingCar hs = new Home_ShoppingCar();
		
		hs.addToShoppingCar(hm1);
		hs.addToShoppingCar(hm1);
		hs.addToShoppingCar(hm1);
		hs.addToShoppingCar(hm2);
		
		hs.showShopCar();
		
		hs.updateNum("1002", 8);
		
		hs.showShopCar();
	}
}
