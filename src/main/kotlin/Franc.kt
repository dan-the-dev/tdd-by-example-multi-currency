class Franc(var amount: Int) {

    fun times(multiplier: Int): Franc
    {
        return Franc(this.amount * multiplier)
    }

    fun equals(dollar: Franc): Boolean
    {
        return this.amount == dollar.amount
    }
}