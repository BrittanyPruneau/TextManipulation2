package codingBat;
/**
 * JUnit test for coding bat challenge wordEnds
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodingBatTest {
	private CodingBat codingbat;

	@BeforeEach
	void setUp() throws Exception 
	{
		codingbat = new CodingBat();
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEqualsc13i() 
	{
		String expected = "c13i";
		String actual = codingbat.wordEnds("abcXY123XYijk", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEquals13() 
	{
		String expected = "13";
		String actual = codingbat.wordEnds("XY123XY", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEquals11() 
	{
		String expected = "11";
		String actual = codingbat.wordEnds("XY1XY", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEqualsXY() 
	{
		String expected = "XY";
		String actual = codingbat.wordEnds("XYXY", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyAreQuotationMarks() 
	{
		String expected = "";
		String actual = codingbat.wordEnds("XY", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyAreQuotationMarksAndOnlyXYInput() 
	{
		String expected = "";
		String actual = codingbat.wordEnds("Hi", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_NoCharactersAreEqualToXY() 
	{
		String expected = "";
		String actual = codingbat.wordEnds("", "XY");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_ThereAreNoCharactersAtAll() 
	{
		String expected = "cxziij";
		String actual = codingbat.wordEnds("abc1xyz1i1j", "1");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEqualTocxziij() 
	{
		String expected = "cxz11";
		String actual = codingbat.wordEnds("abc1xyz11", "1");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyAreEqualTocxz() 
	{
		String expected = "cxz";
		String actual = codingbat.wordEnds("abc1xyz1", "1");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyEqualTocxz11() 
	{
		String expected = "11";
		String actual = codingbat.wordEnds("abc1xyz1abc", "abc");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyAreEqualTo11() 
	{
		String expected = "acac";
		String actual = codingbat.wordEnds("abc1xyz1abc", "b");
		assertEquals(expected, actual);
	}

	@Test
	void testWordEnds_CharactersOutsideOfXyAreEqualTo1111() 
	{
		String expected = "1111";
		String actual = codingbat.wordEnds("abc1abc1abc", "abc");
		assertEquals(expected, actual);
	}

}
