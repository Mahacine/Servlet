package mesCommandes;

import javax.servlet.http.Cookie;

public class Identification {
	
	static String chercheNom (Cookie [] cookies) {
		String cookieName="nom";
		String cookieValue=null;
		for ( int i=0; i<cookies.length; i++) {
		      Cookie cookie = cookies[i];
		      if (cookieName.equals(cookie.getName()))
		        cookieValue=cookie.getValue();
		    }
		return cookieValue;
	}

}
