package ex.standardofjava;

import java.util.*;

public class ExCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH);
		System.out.println(thisMonth);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}
