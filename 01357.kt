fun main(){
    var nums=readLine()!!.split(" ")
    var a=nums[0].reversed().toInt()+nums[1].reversed().toInt()
    var res=Integer.toString(a)
    println(res.reversed().toInt())
}