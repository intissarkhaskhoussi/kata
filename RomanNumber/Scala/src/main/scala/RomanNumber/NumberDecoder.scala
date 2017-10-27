
package RomanNumber

import scala.annotation.tailrec

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    @tailrec
    def recDecode(it:Int, partialRoman:String) : (String,Int)=
    {
      if (it == 0)
      {
        return (partialRoman,0)
      }
      val (str,i) = ConversionData.findFirstInferior(it)
      recDecode(it-i, partialRoman+str)
    }
    recDecode(number,"")._1
  }
}

object ConversionData{
  val UnitValue = List(("M", 1000), ("CM", 900), ("D", 500), ("CD", 400), ("C", 100),
    ("XC", 90), ("L", 50), ("XL", 40), ("X", 10),
    ("IX", 9), ("V", 5), ("IV", 4), ("I",1))

  def findFirstInferior(number:Int) : (String,Int) = UnitValue.filter(e => e._2 <=number).head
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()
}