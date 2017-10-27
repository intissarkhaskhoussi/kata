
import org.scalatest.FlatSpec

class NumberDecoderTest extends FlatSpec
{
  "NumberDecoder" should "return I when it gets 1 as input" in
    {
      assert (new RomanNumber.NumberDecoder().Decode(1) == "I")
    }

  "NumberDecoder" should "return I when it gets 1 as input" in
    {
      assert (new RomanNumber.NumberDecoder().Decode(2) == "II")
    }
}