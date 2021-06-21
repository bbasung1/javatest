import java.util.Scanner
fun main(){
    val scan=Scanner(System.`in`)
    var a:Int=scan.nextInt()
    for(i: Int in 1..9){
        println("${a} * ${i} = ${a*i}")
    }
}
