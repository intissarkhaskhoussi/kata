
package RomanNumber

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    var it = number
    var str = ""
    while (it > 0){
      if (it >=4){
        str+="IV"
        it-=4
      }
      else{
        str+="I"
        it-=1
      }
    }
    str
  }
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()
}