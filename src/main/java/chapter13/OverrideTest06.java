package chapter13;

/*
	私有方法不能覆盖
*/

public class OverrideTest06 {

	// 私有方法
	private void doSome(){
		System.out.println("OverrideTest06's private method doSome execute!");
	}
	public static void main(String[] args) {
		// 多态
		OverrideTest06 o = new T();
		o.doSome(); //OverrideTest06's private method doSome execute!
	}
}

// 在外部类中无法访问私有的
class MyMain{
	public static void main(String[] args) {
		OverrideTest06 o = new T();
		// 错误：doSome() 在 chapter13.OverrideTest06 中是 private 访问控制
		//o.doSome();
	}
}

// 子类
class T extends OverrideTest06{
	// 尝试重写父类中的doSome方法
	// 访问权限不能更低，可以更高
	public void doSome(){
		System.out.println("T's private method doSome execute!");
	}
}
