fun main(args: Array<String>) {
    println(inc(1))
    println(returnInc(1))
    println(returnReturnInc(1))
    println(rTRTRTTRTRTRRRTTTTRTRTRTRTRTRRTRInc(99))
}

fun inc(value: Int): Int {
    return value.inc()
}

fun returnInc(value: Int): Int {
    return inc(value)
}

fun returnReturnInc(value: Int): Int {
    return return inc(value)
}

fun rTRTRTTRTRTRRRTTTTRTRTRTRTRTRRRRInc(value: Int): Int {
    return throw return throw throw throw return throw return return return inc(value)
}
