package chapter12;

/*
	分析以下程序存在什么问题？代码臃肿，代码没有得到重复利用
*/

public class ExtendsTest01 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAcctNo("1111111");
		a.setBalance(10000);
		System.out.println(a.getAcctNo() + "，余额" + a.getBalance());

		CreditAccount ca = new CreditAccount();
		ca.setAcctNo("2222222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);
		System.out.println(ca.getAcctNo() + "，余额" + ca.getBalance());
	}
}

class Account{ // 父类
	private String acctNo;
	private double balance;

	public Account(){}
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


// 其他类型的账户：信用卡账户
// 账户、余额、信誉度
class CreditAccount extends Account{ // 子类
/*	private String acctNo;
	private double balance;*/
	private double credit;

	public CreditAccount(){}

	public void doSome(){
		// 错误：acctNo 在 chapter12.Account 中是 private 访问控制
		//System.out.println(acctNo);

		// 间接访问
		System.out.println(getAcctNo());
	}

	/*public double getBalance() {
		return balance;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}*/
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
}

