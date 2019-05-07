package dev.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dev.exceptions.CheckNullException;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() throws CheckNullException {
		StringUtils su = new StringUtils();
		assertTrue(su.levenshteinDistance("Chien", "Chine") == 2);
		assertTrue(su.levenshteinDistance("machine", "machins") == 1);
	}

	@Test(expected = CheckNullException.class)
	public void testLevenshteinDistanceNull() throws CheckNullException {
		StringUtils su = new StringUtils();
		int result = su.levenshteinDistance("Chien", null);
		assertTrue(result == 5);
		result = su.levenshteinDistance(null, "Chien");
		assertTrue(result == 5);
		result = su.levenshteinDistance(null, null);
		assertTrue(result == 5);

	}

}
