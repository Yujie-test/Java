package chapter11;

/*
	一、请通过代码封装，实现如下需求
	编写一个Book类，代表教材：
	1、具有属性：名称（title）、页数（pageNum）
	2、其中页数不能少于200页，否则输出错误信息，并赋予默认值200
	3、为各属性提供赋值和取值方法
	4、具有方法detail，用来在控制台输出每本教材的名称和页数
	5、编写BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象detail方法

	二、写一个名为Account的类的模拟账户
		属性：账户id，余额balance，年利率annualInterestRate；
		方法：各属性的set，get方法。取款方法withdraw()，存款方法deposit()
*/

public class Homework {
	public static void main(String[] args) {
		Book b = new Book("A", 100);
		System.out.println(b.getTitle());
		System.out.println(b.getPageNum());

		b.setTitle("B");
		b.setPageNum(210);
		System.out.println(b.getTitle());
		System.out.println(b.getPageNum());

		b.detail();

		Book b1 = new Book();
		b1.detail();

		System.out.println("------------------------------------------------");

		Account a = new Account("1000", 2000, 1.23);
		Customer1 c = new Customer1("Jane Smith", a);
		c.getAcct().deposit(100);
		c.getAcct().withdraw(960);
		c.getAcct().withdraw(2000);
		System.out.println("Customer " + c.getName() + " has an account: id is " + a.getId() + " annualInterestRate is " + a.getAnnualInterestRate() + "%, balance is " + a.getBalance());
	}
}

class Book {
	// 实例变量
	private String title;
	private int pageNum;

	// 构造方法
	// 无参构造方法
	public Book(){

	}

	// 有参构造方法
	public Book(String title, int pageNum){
		this.title = title;
		if (pageNum < 200){
			System.out.println("Wrong pageNum!");
			this.pageNum = 200;
		} else {
			this.pageNum = pageNum;
		}
	}

	// setter and getter method
	public String getTitle(){
		return this.title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public int getPageNum(){
		return this.pageNum;
	}

	public void setPageNum(int pageNum){
		if (pageNum < 200){
			System.out.println("Wrong pageNum!");
			this.pageNum = 200;
			return;
		}
		this.pageNum = pageNum;
	}

	// 实例方法
	public void detail(){
		System.out.println("The book's title is " + this.title + ", there're " + this.pageNum + " pages.");
	}
}

class Account {
	// 实例变量
	private String id;
	private int balance;
	private double annualInterestRate;

	// 构造方法
	// 无参构造方法
	public Account(){

	}

	// 有参构造方法
	public Account(String id, int balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	// setter and getter method
	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public int getBalance(){
		return this.balance;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	// 实例方法
	public void withdraw(int num){
		if (num > this.getBalance()){
			System.out.println("余额不足，取钱失败！");
			return;
		}
		balance -= num;
		System.out.println("Withdraw " + num);
	}

	public void deposit(int num){
		balance += num;
		// 调用方法来修改余额
		//this.setBalance(this.getBalance() + num);
		// this. 可以省略
		//setBalance(getBalance() + num);
		System.out.println("Deposit " + num);
	}
}

// 面向对象的思想培养
class Customer1{
	private String name;
	private Account acct;

	public Customer1(){

	}
	public Customer1(String name, Account acct){
		this.name = name;
		this.acct = acct;
	}

	public String getName() {
		return name;
	}

	public Account getAcct() {
		return acct;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}
}


