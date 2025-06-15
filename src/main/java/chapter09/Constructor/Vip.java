package chapter09.Constructor;

/*

*/

public class Vip {

	// 会员号
	long no;

	// 会员姓名
	String name;

	// 生日
	String birth;

	// 性别
	boolean sex;

	// 无参数构造方法
	public Vip() {

	}

	// 有参数构造方法
	public Vip(long huiYuanHao, String xingMing) {
		// 给实例变量赋值【初始化实例变量，初始化属性】
		no = huiYuanHao;
		name = xingMing;
	}

	// 有参数构造方法
	public Vip(long huiYuanHao, String xingMing, String shengRi) {
		// 给实例变量赋值【初始化实例变量，初始化属性】
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;
		// 实际上这里有一行默认的代码
		// sex = false;
	}

	// 有参数构造方法
	public Vip(long huiYuanHao, String xingMing, String shengRi, boolean xingBie) {
		// 给实例变量赋值【初始化实例变量，初始化属性】
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;
		sex = xingBie;
	}
}

