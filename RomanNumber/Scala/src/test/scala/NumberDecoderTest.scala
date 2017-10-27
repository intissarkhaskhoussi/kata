
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

  "NumberDecoder" should "return L when it gets 50 as input" in
    {
      assert (NumberDecoder().Decode(50) == "L")
    }

  "NumberDecoder" should "return XC when it gets 90 as input" in
    {
      val some = NumberDecoder().Decode(90)
      assert (some.contains("XC"))
      val Some(v) = some
      assert (v == "XC")
    }

  "NumberDecoder" should "return C when it gets 100 as input" in
    {
      val some = NumberDecoder().Decode(100)
      assert (some.contains("C"))
      val Some(v) = some
      assert (v == "C")
    }

  "NumberDecoder" should "return CD when it gets 400 as input" in
    {
      val some = NumberDecoder().Decode(400)
      assert (some.contains("CD"))
      val Some(v) = some
      assert (v == "CD")
    }

  "NumberDecoder" should "return D when it gets 500 as input" in
    {
      val some = NumberDecoder().Decode(500)
      assert (some.contains("D"))
      val Some(v) = some
      assert (v == "D")
    }

  "NumberDecoder" should "return CM when it gets 900 as input" in
    {
      val some = NumberDecoder().Decode(900)
      assert (some.contains("CM"))
      val Some(v) = some
      assert (v == "CM")
    }

  "NumberDecoder" should "return M when it gets 1000 as input" in
    {
      val some = NumberDecoder().Decode(1000)
      assert (some.contains("M"))
      val Some(v) = some
      assert (v == "M")
    }
}