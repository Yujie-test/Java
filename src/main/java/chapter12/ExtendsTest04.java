package chapter12;

/*
	默认继承Object，Object中有哪些方法呢？

	public class Object {

		// 注意：当源码当中一个方法以“;”结尾，并且修饰符列表中有“native“关键字表示底层调用C++写的dll程序（dll动态链接库文件）

		private static native void registerNatives();

		// 静态代码块
		static {
			// 调用registerNatives()方法
			registerNatives();
		}

		// 底层也是调用C++
		public final native Class<?> getClass();
		public native int hashCode();

		// equals()方法应该能看懂
		// public是公开的
		// boolean是方法的返回值类型
		// equals是一个方法名：相等
		// java.lang.Object obj 形参
		public boolean equals(java.lang.Object obj) {
			// 方法体
			return (this == obj);
		}

		// 已有对象a，想创建一个和a一摸一样的对象，你可以调用这个克隆方法
		// 底层也是调用C++
		protected native java.lang.Object clone() throws CloneNotSupportedException;

		// 可以测试这个方法
		// public是公开的
		// String是返回值类型，toString()方法执行结束后返回一个字符串
		// toString()是方法名
		// ()表示形参个数为0
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}

		public final native void notify();

		public final native void notifyAll();

		public final native void wait(long timeout) throws InterruptedException;

		public final void wait(long timeout, int nanos) throws InterruptedException {
			if (timeout < 0) {
				throw new IllegalArgumentException("timeout value is negative");
			}

			if (nanos < 0 || nanos > 999999) {
				throw new IllegalArgumentException(
						"nanosecond timeout value out of range");
			}

			if (nanos > 0) {
				timeout++;
			}

			wait(timeout);
		}

		public final void wait() throws InterruptedException {
			wait(0);
		}

		protected void finalize() throws Throwable { }
		}
*/

public class ExtendsTest04 {

	// ExtendsTest04默认继承Object
	// ExtendsTest04当中是有toString()方法
	// 不过toString()方法是一个实例方法，需要创建对象才能调用

	/*public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}*/
	public static void main(String[] args) {
		// 分析这个代码可以执行吗？
		// 错误：无法从静态上下文中引用非静态 方法 toString()
		//ExtendsTest04.toString();

		// 先new对象
		ExtendsTest04 et = new ExtendsTest04();
		String retValue = et.toString();

		// 1540e19d可以“等同”看作对象在堆内存当中的内存地址
		// 实际上是内存地址经过“哈希算法”得出的十六进制结果
		System.out.println(retValue); // chapter12.ExtendsTest04@1540e19d

		// 创建对象
		Product pro = new Product();
		String retValue2 = pro.toString();
		System.out.println(retValue2); // chapter12.Product@677327b6

		// 以上两行代码能否合并成一行
		System.out.println(pro.toString()); // chapter12.Product@677327b6

		// 如果直接输出“引用”呢
		// println()方法会自动调用pro的toString()方法
		System.out.println(pro); // chapter12.Product@677327b6
	}
}

class Product{
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
}

