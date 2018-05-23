/**
  * Created by bijudevassy on 23/5/18.
  * http://exercism.io/exercises/scala/leap/readme
  */
object LeapYear extends App{

  def checkLeapYear(x: Int)={
    x%4==0 && (!(x%100==0) || x%400==0)
  }

  println(checkLeapYear(2015))
  println(checkLeapYear(1996))
  println(checkLeapYear(2100))
  println(checkLeapYear(2000))
}
