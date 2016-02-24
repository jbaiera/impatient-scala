package chapters.ch08

/**
  * Chapter 08, Example 01:
  * Extend the following BankAccount class to a CheckingAccount class that charges $1
  * for every deposit and withdrawal.
  *
  * *** Errata:
  * Add a current balance getter to the Bank Account class.
  */
object Ex01 extends App {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double): Double = { super.deposit(amount); super.withdraw(1) }
    override def withdraw(amount: Double): Double = { super.withdraw(amount); super.withdraw(1) }
  }

}
