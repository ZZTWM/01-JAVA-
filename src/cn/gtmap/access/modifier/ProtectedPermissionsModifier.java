package cn.gtmap.access.modifier;

/**
 * protected 受保护的
 * @author Administrator
 *
 */
public class ProtectedPermissionsModifier {
	private int id;
	
    // protected饰符的属性 name
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类可以继承
 
    // 同包类可以访问
    // 不同包类不能访问
	protected String name;
	
}
