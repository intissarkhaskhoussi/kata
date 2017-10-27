
package RomanNumber

class NumberDecoder
{
  def Decode(number:Int) : String =
  {
    var it = number
    var str = ""
    while (it > 0){
      it match{
        case i:Int if (i>=5) =>{
          str+="V"
          it-=5
        }
        case i:Int if (i>=4) =>{
          str+="IV"
          it-=4
        }
        case i:Int if (i<=3) =>{
          str+="I"
          it-=1
        }
      }
    }
    str
  }
}

object NumberDecoder
{
  def apply(): NumberDecoder = new NumberDecoder()
}