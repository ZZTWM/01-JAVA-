package cn.gtmap.access.modifier;
/**
 * 没有修饰符即代表package/friendly/default 
 * @author Administrator
 *
 */
public class DefaultPermissionsModifier {
	
	private int id;
	
    // 无修饰符的属性name
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类不能继承
 
    // 同包类可以访问
    // 不同包类不能访问
	String name;
	

	
}
