fun inc(value: Int): Int {
    return value.inc()
}
fun returnInc(value: Int): Int {
    return inc(value)
}
fun returnReturnInc(value: Int): Int {
    return return inc(value)
}
inc(1)
returnInc(1)
returnReturnInc(1)

fun rTRTRTTRTRTRRRTTTTRTRTRTRTRTRRRRInc(value: Int): Int {
    return throw return throw throw throw return throw return return return inc(value)
}

rTRTRTTRTRTRRRTTTTRTRTRTRTRTRRTRInc(9)
