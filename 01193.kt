import java.util.Scanner
fun main(){
    val scan=Scanner(System.`in`)
    var a:Int=scan.nextInt()
    var n=0
    do{
        n++
    }while(a>n*(n+1)/2)
    var k=(n*(n+1)/2)-a
    if(n%2 == 0){
        println("${n-k}/${k+1}")
    }
    else{
        println("${k+1}/${n-k}")   
    }
}