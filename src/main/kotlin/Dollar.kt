class Dollar(var amount: Int) {

    public fun times(multiplier: Int): Unit
    {
        this.amount *= multiplier
    }
}