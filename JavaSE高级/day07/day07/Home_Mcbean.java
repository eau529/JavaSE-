/**
 * <p>Title: Home_Mcbean.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

/**  
 * 商品类
 */
public class Home_Mcbean {
	private String  mcId;
	private String  name;
	private double  price;
	private String  descried;
	
	
	public Home_Mcbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param mcId
	 * @param name
	 * @param price
	 * @param descried
	 */
	public Home_Mcbean(String mcId, String name, double price, String descried) {
		super();
		this.mcId = mcId;
		this.name = name;
		this.price = price;
		this.descried = descried;
	}
	/**
	 * @return the mcId
	 */
	public String getMcId() {
		return mcId;
	}
	/**
	 * @param mcId the mcId to set
	 */
	public void setMcId(String mcId) {
		this.mcId = mcId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the descried
	 */
	public String getDescried() {
		return descried;
	}
	/**
	 * @param descried the descried to set
	 */
	public void setDescried(String descried) {
		this.descried = descried;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descried == null) ? 0 : descried.hashCode());
		result = prime * result + ((mcId == null) ? 0 : mcId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Home_Mcbean other = (Home_Mcbean) obj;
		if (descried == null) {
			if (other.descried != null)
				return false;
		} else if (!descried.equals(other.descried))
			return false;
		if (mcId == null) {
			if (other.mcId != null)
				return false;
		} else if (!mcId.equals(other.mcId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Home_Mcbean [mcId=" + mcId + ", name=" + name + ", price=" + price + ", descried=" + descried + "]";
	}
	
	
	
}
