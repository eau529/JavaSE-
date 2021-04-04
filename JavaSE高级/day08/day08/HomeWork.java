/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;
public class HomeWork {
	static String s = "-";
	
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				try {
					throw new Exception();
				} catch (Exception ex) {
					s += "ic";
				}
				throw new Exception();
			} catch (Exception x) {
				s += "mc";
			} finally {
				s += "mf";
			}
		} finally {
			s += "of";
		}
		
		System.out.println(s);
	}
	
	
}
