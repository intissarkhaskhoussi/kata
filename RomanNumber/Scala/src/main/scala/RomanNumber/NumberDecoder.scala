
package RomanNumber

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    var it = number
    var str = ""
    while (it > 0){
      str+="I"
      it-=1
    }
    str
  }
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()
}