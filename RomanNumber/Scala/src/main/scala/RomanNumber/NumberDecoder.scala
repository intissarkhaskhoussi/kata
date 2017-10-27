
package RomanNumber

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    number match{
      case 1 => "I"
      case 2 => "II"
      case 3 => "III"
    }
  }
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()
}