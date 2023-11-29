fun main() {

    var like = 0

    /**
     * подготовка текста по правилам русского языка
     */
    fun makeLike(): String {
        like += 1
        return if ((like - 1) % 10 == 0 && (like - 11) % 100 != 0) "$like человеку" else "$like людям"
    }

    // отладка
    for (i in 1..1000) {
        println("Понравилось ${makeLike()}")
    }
}

