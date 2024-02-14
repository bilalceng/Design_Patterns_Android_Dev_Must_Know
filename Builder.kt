class Hamburger private constructor(
    val onion: Boolean,
    val cheese: Boolean,
    val ketchup: Boolean,
    val tomatoes: Boolean
) {
   class Builder{
        private var onion: Boolean = true
        private var cheese: Boolean = true
        private var ketchup: Boolean = true
        private var tomatoes: Boolean = true

        fun isAddOnion(value: Boolean) = apply { onion = value }
        fun isAddCheese(value: Boolean) = apply { cheese = value }
        fun isAddKetchup(value: Boolean) = apply { ketchup = value }
        fun isAddTomatoes(value: Boolean) = apply { tomatoes = value }
        fun build() = Hamburger(onion,cheese,ketchup,tomatoes)
    }

}

fun main(){
    var hamburgerWithoutOnion = Hamburger.Builder()
        .isAddOnion(false)
        .isAddCheese(true)
        .isAddKetchup(true)
        .isAddTomatoes(true)
        .build()
}