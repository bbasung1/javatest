import java.util.Scanner
fun main(){
    val scan=Scanner(System.`in`)
    var a:Int=scan.nextInt()
    if((a%4==0&&a%100!=0)||a%400==0){
        println(1)
    }
    else{
        println(0)
    }
}