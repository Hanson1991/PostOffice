package com.hanson1

open class Box {
    internal var width: Float = 0.toFloat()
    internal var height: Int = 0
    internal var length: Float = 0.toFloat()

    constructor() {}

    fun validate(length: Float, width: Float, height: Int): Boolean {
        return (this.length >= length && this.width >= width && this.height >= height)
    }
}

