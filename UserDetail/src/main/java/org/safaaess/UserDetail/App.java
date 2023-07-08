package org.safaaess.UserDetail;

import org.safaass.UserDetail.controller.FindUser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*UserLogin u = new UserLogin();
		u.login("test@gmail.com", "password1");*/

		FindUser u = new FindUser();
		u.findUsersByZipCode("478");
		u.findUserByEmail("test@gmail.com");
	}
}
