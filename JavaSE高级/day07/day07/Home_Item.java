/**
 * <p>Title: Home_Item.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

/**  
 *  订单类
 */
public class Home_Item {
	private String ItemId;
	private Home_Mcbean mcbean;
	private int num;
	public Home_Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param itemId
	 * @param mcbean
	 * @param num
	 */
	public Home_Item(String itemId, Home_Mcbean mcbean, int num) {
		super();
		ItemId = itemId;
		this.mcbean = mcbean;
		this.num = num;
	}
	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return ItemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		ItemId = itemId;
	}
	/**
	 * @return the mcbean
	 */
	public Home_Mcbean getMcbean() {
		return mcbean;
	}
	/**
	 * @param mcbean the mcbean to set
	 */
	public void setMcbean(Home_Mcbean mcbean) {
		this.mcbean = mcbean;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		return "Home_Item [ItemId=" + ItemId + ", mcbean=" + mcbean + ", num=" + num + "]";
	}
	
	
}
