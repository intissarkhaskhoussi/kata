
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

  "NumberDecoder" should "return IX when it gets 9 as input" in
    {
      assert (NumberDecoder().Decode(9) == "IX")
    }

  "NumberDecoder" should "return X when it gets 10 as input" in
    {
      assert (NumberDecoder().Decode(10) == "X")
    }

  "NumberDecoder" should "return XI when it gets 11 as input" in
    {
      assert (NumberDecoder().Decode(11) == "XI")
    }

  "NumberDecoder" should "return XIV when it gets 14 as input" in
    {
      assert (NumberDecoder().Decode(14) == "XIV")
    }

  "NumberDecoder" should "return XXXIX when it gets 39 as input" in
    {
      assert (NumberDecoder().Decode(39) == "XXXIX")
    }

  "NumberDecoder" should "return XL when it gets 40 as input" in
    {
      assert (NumberDecoder().Decode(40) == "XL")
    }
}