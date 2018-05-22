/**
  * Created by bijudevassy on 22/5/18.
  * Examples from http://exercism.io/exercises/scala/sum-of-multiples/readme
  */
object SumOfMultiples extends App{

  def result(numbers: Set[Int],limit: Int) ={

    numbers.flatMap(num=> (for(n <- 1 to (limit-1)/num) yield (n)).map(x=>x*num)).sum

  }


  println(result(Set(3,5),10))

}


