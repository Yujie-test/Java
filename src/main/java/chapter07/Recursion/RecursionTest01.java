package chapter07.Recursion;

/*
	方法递归
	    1、什么是方法递归
	        方法自己调用自己，这就是方法递归
	    2、当递归时没有结束条件，一定会发生栈内存溢出错误：StackOverflowError
	        所以，递归必须要有结束条件
	    3、递归假设是有结束条件的，就一定不会发生栈内存溢出错误码？
	        假设这个结束条件是对的，是合法的，递归有时候也会出现栈内存溢出错误。
	        因为有可能递归的太深，栈内存不够了，因为一直在压栈
	    4、在实际的开发中，不建议轻易的选择递归，能用for循环while循环代替的，尽量使用循环来做
	    因为循环的效率高，耗费的内存少。递归耗费的内存比较大，另外，递归地使用不当，会导致JVM死掉。
	    （但在极少数情况下，不用递归，这个程序没法实现）
	    5、在实际的开发中：假设有一天你真正的遇到了：StackOverflowError，怎么解决这个问题？
	        首先：先检查递归的结束条件对不对。如果递归结束条件不对，必须对条件进一步修改，知道正确为止
	        其次：这个时候需要手动的调整JVM的栈内存初始化大小。可以将栈内存的空间调大点
	        最后：如果调整了大小，运行是还是出现这个错误。没办法，只能继续扩大栈内存大小。（java -X参数可以查看/调整栈内存大小）
*/

public class RecursionTest01 {
    // 入口
    public static void main(String[] args) {
        doSome();
    }

    public static void doSome() {
        System.out.println("doSome begin");
        // 调用方法：doSome()既然是一个方法，那么doSome方法可以调用吗？当然可以
        // 目前这个递归是没有结束条件的，会出现什么问题
        doSome();
        // 这行代码永远执行不到
        System.out.println("doSome over");
    }
}
