package nl.siegmann.ehcachetag.util;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;

public class StringUtil {

	/**
	 * Finds and returns the string from the alternatives that closest matches the input string based on the Levenshtein distance.
	 * 
	 * @see <a href="http://en.wikipedia.org/wiki/Levenshtein_distance">Levenshtein Distance</a>
	 * 
	 * @param input
	 * @param alternatives
	 * @return the string from the alternatives that closest matches the input string based on the Levenshtein distance.
	 */
	public static String getClosestMatchingString(String input, Collection<String> alternatives) {
		if (input == null || alternatives == null || alternatives.isEmpty()) {
			return null;
		}
		String current = null;
		int minDistance = Integer.MAX_VALUE;
		for (String alternative: alternatives) {
			if (current == null) {
				current = alternative;
				continue;
			}
			int currentDistance = StringUtils.getLevenshteinDistance(input, alternative);
			if (currentDistance < minDistance) {
				minDistance = currentDistance;
				current = alternative;
			}
		}
		return current;
	}

}
