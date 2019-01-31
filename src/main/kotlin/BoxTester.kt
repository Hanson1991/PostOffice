import java.util.*
import com.hanson1.Box3
import com.hanson1.Box5

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    println("Please enter object's1 length")
    val length = input.nextFloat()
    println("Please enter object's1 width")
    val width = input.nextFloat()
    println("Please enter object's1 height")
    val height = input.nextInt()
    val box3 = Box3()
    val box5 = Box5()
    if (box3.validate(length, width, height)) {
        println("你的包裹適合Box3的尺寸")
    } else if (box5.validate(length, width, height)) {
        println("你的包裹適合Box5的尺寸")
    } else {
        println("沒有合適尺寸的Box")
    }
}