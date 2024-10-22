open class BankAccount(val accountHolder:String, balance:Double){
    var balance: Double = balance
        get(){
            println("Seu saldo é: ${field}")
            return field
        }
        private set

    fun deposit(amount:Double){
        balance += amount
        print("O seu novo saldo é: ${balance}")

    }
    fun withdrawal(amount:Double) {
        if (balance > 0.0) {
            this.balance -= amount
            println("Agora seu novo saldo é: ${this.balance}")

        }else{
            println("Saldo insuficiente. O saque não pode ser realizado.")
        }
    }
}

fun main() {
    var b:BankAccount = BankAccount("João Silva", 3810.2)
    b.withdrawal(10.0)
    b.deposit(20.0)
}