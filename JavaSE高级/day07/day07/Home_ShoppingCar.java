/**
 * <p>Title: Home_ShoppingCar.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**  
 *  购物车类
 */
public class Home_ShoppingCar {
	private double totalPrice;  //购物车所有商品总价格
	private int totalCount;     //购物车所有商品数量
	//商品编号与订单项的键值对 ，商品的id为key，value为对应的订单
	private Map<String,Home_Item> itemMap=new HashMap<>();

	public Home_ShoppingCar() {
	
	} 
	
	//向购物车中添加商品
	public boolean addToShoppingCar(Home_Mcbean mcBean){
		String mcId = mcBean.getMcId();
		//判断商品是否存在
		if(!itemMap.containsKey(mcId)) { // 表示订单不存在，第一次添加商品
			//以时间作为订单id
			Date date = new Date();
			String ItemId=new SimpleDateFormat("yyyyMMddHHmmss").format(date);
			//创建订单对象
			Home_Item item=new Home_Item(ItemId,mcBean,1);	
			// 将创建好订单和对应 商品id存入 map中
			itemMap.put(mcId, item);

			setTotalCount();
			return true;
		}else {
			//如果 已经存在，只是修改数量即可
			Home_Item item=itemMap.get(mcId);
			item.setNum(item.getNum()+1);

			setTotalCount();
			return true;
		}	
	}
	
	public boolean updateNum(String mcId,int num){
		Home_Item item=itemMap.get(mcId);
		item.setNum(num);
		
		setTotalCount();
		return true;
	}
	
	//删除当前商品
	public boolean delete(String mcId){
		itemMap.remove(mcId);
		
		setTotalCount();
		return true;
	}
	
	public void setTotalCount() {
		Collection<Home_Item> Items= itemMap.values();
		int sunNum=0;
		for (Home_Item item : Items) {
			sunNum+=item.getNum();
		}
		totalCount=sunNum;
	}

	public int getTotalCount() {
		return totalCount;
	}
	
	public void showShopCar() {
		System.out.println("订单："+ itemMap+ ",总数量"+totalCount);
	}
}