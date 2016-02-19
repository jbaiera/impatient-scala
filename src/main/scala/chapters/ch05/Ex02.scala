package chapters.ch05

/**
  * Chapter 05, Example 02:
  * Write a class BankAccount with methods deposit and withdraw, and a read-only
  * property balance.
  */
object Ex02 extends App {

  class BankAccount {
    private var amount = 0.0

    def balance = amount

    def deposit(v: Double) { amount += v }
    def withdraw(v: Double) { amount -= v }
  }

}
        