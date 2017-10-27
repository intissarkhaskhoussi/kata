
import RomanNumber._
import org.scalatest.FlatSpec

class NumberDecoderTest extends FlatSpec
{
  "NumberDecoder" should "return I when it gets 1 as input" in
    {
      assert (NumberDecoder().Decode(1) == "I")
    }

  "NumberDecoder" should "return II when it gets 2 as input" in
    {
      assert (NumberDecoder().Decode(2) == "II")
    }

  "NumberDecoder" should "return III when it gets 3 as input" in
    {
      assert (NumberDecoder().Decode(3) == "III")
    }

  "NumberDecoder" should "return IV when it gets 4 as input" in
    {
      assert (NumberDecoder().Decode(4) == "IV")
    }

  "NumberDecoder" should "return V when it gets 5 as input" in
    {
      assert (NumberDecoder().Decode(5) == "V")
    }
}