import java.util.Scanner
fun main(){
   val scan=Scanner(System.`in`)
   var a:Int=scan.nextInt()
   var b=Array(a,{0})
   for(i in 0..a-1){
       b[i]=scan.nextInt()
   }
   for(i in b){
       println(i)
   }
}
