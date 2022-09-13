package tutorial07

object Q4 extends App {
  val account1= new BankAccount1("Amal",20000936,15000.00)
  val account2= new BankAccount1("Hasindu",20000937,12000.00)
  val account3= new BankAccount1("Kamal",20000938,2000.00)
  val account4= new BankAccount1("Perera",20000939,-4000.00)

  var bank:List[BankAccount1]=List(account1,account2,account3,account4)

  val negbalance = bank.filter(a=>a.balance<0)
  val totbalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
  val interest = (b:List[BankAccount1])=>b.map((a) => (a.ID,a.accountnumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("\nAccounts with negative balance: ")
  println(negbalance)
  print("Sum of all account balances: ")
  println(totbalance)
  print("Final balances with interest: ")
  println(interest(bank))
}

class BankAccount1(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"
}
