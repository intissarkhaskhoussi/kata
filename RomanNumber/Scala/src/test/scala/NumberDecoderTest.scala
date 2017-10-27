
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

  "NumberDecoder" should "return VI when it gets 6 as input" in
    {
      assert (NumberDecoder().Decode(6) == "VI")
    }

  "NumberDecoder" should "return VI when it gets 7 as input" in
    {
      assert (NumberDecoder().Decode(7) == "VII")
    }

  "NumberDecoder" should "return VI when it gets 8 as input" in
    {
      assert (NumberDecoder().Decode(8) == "VIII")
    }

  "NumberDecoder" should "return VI when it gets 9 as input" in
    {
      assert (NumberDecoder().Decode(8) == "IX")
    }
}