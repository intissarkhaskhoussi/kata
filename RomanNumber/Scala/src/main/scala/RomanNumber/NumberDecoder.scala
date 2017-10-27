
package RomanNumber

import scala.annotation.tailrec

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    @tailrec
    def recDecode(number:Int,Value:String, list:List[(String,Int)]) : String=
    {
      val newList = list.dropWhile(group => group._2 > number)
      if (newList.isEmpty)
        return Value
      newList.head match {
        case _@(str, i) => recDecode (number - i, Value+ str, newList)
      }
    }

    recDecode(number,"",NumberDecoder.UnitValue)
  }
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()

  private val UnitValue = List( ("M", 1000), ("CM", 900), ("D", 500), ("CD", 400), ("C", 100),
    ("XC", 90), ("L", 50), ("XL", 40), ("X", 10),
    ("IX", 9), ("V", 5), ("IV", 4), ("I",1))
}