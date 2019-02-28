package cn.gtmap.access.modifier;
/**
 * private
 * @author Administrator
 *	使用private修饰属性
 *	自身：是可以访问的
 *	同包子类：不能继承
 *	不同包子类：不能继承
 *	同包类：不能访问
 *	其他包类：不能访问
 */
public class PrivatePermissionsModifier {
	
    //属性id是private的，只有PrivatePermissionsModifier自己可以访问
    //子类不能继承
    //其他类也不能访问
	private int id;
	
	String name;
	
}
