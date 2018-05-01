package tools;

import org.apache.commons.lang3.RandomStringUtils;

public class PassGen {

	public static String createPassword(int length) {

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";

		return RandomStringUtils.random(length, characters);
	}
}
