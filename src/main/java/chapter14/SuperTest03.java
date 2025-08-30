package chapter14;

/*
	1、举个例子：在恰当的时间使用：super（实际参数列表）
	2、注意：在构造方法执行过程中一连串调用了父类的构造方法，父类的构造方法有继续向下调用他的父类的构造方法，
	但是实际上对象只创建了一个
	3、思考：“super(实参)”到底是干啥的？
		“super(实参)”的作用是：初始化当前对象的父类型特征
		并不是创建新对象，实际上对象只创建了一个
	4、super关键字代表什么？
		super关键字代表的就是“当前对象”的那部分父类型特征

		我继承了我父亲的一部分特征：
			例如：眼睛、皮肤等
			super代表的是“眼睛、皮肤等”
			“眼睛、皮肤等”虽然是继承类父亲的，但这部分是在我身上
*/

public class SuperTest03 {
	public static void main(String[] args) {
		CreditAccount ca1 = new CreditAccount();
		System.out.println(ca1.getAcctNo() + ", " + ca1.getBalance() + ", " + ca1.getCredit());
		CreditAccount ca2 = new CreditAccount("11111", 10000, 0.999);
		System.out.println(ca2.getAcctNo() + ", " + ca2.getBalance() + ", " + ca2.getCredit());
	}
}

// 账户
class Account{
	// 属性
	private String acctNo;
	private double balance;

	// 构造方法
	public Account(){
		// super();
		// this.acctNo = null;
		// this.balance = 0.0;
	}
	public Account(String acctNo, double balance){
		this.acctNo = acctNo;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

// 信用账户
class CreditAccount extends Account {

	// 属性：信誉度（诚信值）
	// 子类特有的一个特征，父类没有
	private double credit;

	// 构造方法
	public CreditAccount(){
		// super();
		// this.credit = 0.0;
	}

	// 提供有参数构造方法
	// 分析以下程序程序是否存在编译错误
	public CreditAccount(String acctNo, double balance, double credit){
		// 私有的属性，只能在本类中执行
		/*this.acctNo = acctNo;
		this.balance = balance;*/

		// 以上两行代码在恰当的位置，正好可以使用：super(acctNo, balance);
		// 通过子类的构造方法调用父类的构造方法
		super(acctNo, balance);
		this.credit = credit;
	}

	// setter和getter方法
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
}
