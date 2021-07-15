package ssm

object test{
  def main(args:Array[String]){
    val a=10
    val b=20
    println(a+b)//30
    println(b-a)//10
    println(a*b)//200
    println(a/b)//0
    println(a.toFloat/b)//0.5
    println(a.toFloat/b.toFloat)//0.5
    println(a%b)//10
  }
}