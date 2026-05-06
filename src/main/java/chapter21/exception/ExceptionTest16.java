package chapter21.exception;

// 测试改良之后的Stack
// 最后这个例子，是异常最重要的案例。必须掌握，自定义异常在实际开发中的应用
public class ExceptionTest16 {
    public static void main(String[] args) {
        // 创建栈对象
        Stack stack = new Stack(10);

        // 压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            // 栈已满
            stack.push(new Object());
        } catch (MyStackOperationException e) {
            // 输出异常的简单信息
            System.out.println(e.getMessage());
        }

        // 弹栈
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            // 栈已空
            stack.pop();
        } catch (MyStackOperationException e) {
            // 输出异常的简单信息
            System.out.println(e.getMessage());
        }
    }
}
