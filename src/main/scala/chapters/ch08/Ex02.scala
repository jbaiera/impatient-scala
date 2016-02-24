package chapters.ch08

import chapters.ch08.Ex01.BankAccount

/**
  * Chapter 08, Example 02:
  * Extend the BankAccount class of the preceding exercise into a class SavingsAccount
  * that earns interest every month (when a method earnMonthlyInterest is called)
  * and has three free deposits or withdrawals every month. Reset the transaction
  * count in the earnMonthlyInterest method.
  */
object Ex02 extends App {

  class SavingsAccount(balance: Double, private val monthlyInterest: Double = 0.02) extends BankAccount(balance) {

    private var monthlyTxnCount = 0

    def earnMonthlyInterest(): Unit = {
      super.deposit(currentBalance * monthlyInterest)
      monthlyTxnCount = 0
    }

    override def deposit(amount: Double): Double = {
      if (monthlyTxnCount < 3) {
        monthlyTxnCount += 1
        super.deposit(amount)
      } else {
        super.deposit(amount - 1)
      }
    }

    override def withdraw(amount: Double): Double = {
      if (monthlyTxnCount < 3) {
        monthlyTxnCount += 1
        super.withdraw(amount)
      } else {
        super.withdraw(amount + 1)
      }
    }
  }

}
