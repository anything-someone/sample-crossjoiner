package anything.someone.sample.crossjoiner;

import java.util.ArrayList;
import java.util.List;

public class CrossJoinerUtil {

	/**
	 * 効率とか無視
	 * 
	 * @param aLeftStrings
	 * @param aRightStrings
	 */
	public static List<String> crossJoin(List<String> aLeftStrings, List<String> aRightStrings) {
		List<String> tJoinedStrings = new ArrayList<String>();
		for (String tLeftString : aLeftStrings) {
			for (String tRightString : aRightStrings) {
				tJoinedStrings.add(tLeftString + tRightString);
			}
		}
		return tJoinedStrings;
	}

}
