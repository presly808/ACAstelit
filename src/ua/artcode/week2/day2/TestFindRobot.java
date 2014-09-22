package ua.artcode.week2.day2;

import ua.artcode.ArrayUtils;

public class TestFindRobot {

	public static void main(String[] args) {
		int range = 1024;
		int lucky = ArrayUtils.genRandomNumber(0, range);
		System.out.println(lucky);
		int count = ArrayUtils.find(lucky, range);
		System.out.println(count);
	}
	
}
