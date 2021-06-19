import java.util.Scanner
fun main(){
    val scan=Scanner(System.`in`)
    var a:Int=scan.nextInt()
    var b:Int=scan.nextInt()
    var c=1
    var d=1
    for(i in 1..b ){
        c*=(a-i+1)
        d*=i
    }
    println("${c/d}")
}