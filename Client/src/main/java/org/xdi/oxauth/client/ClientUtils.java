/*
 * oxAuth is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */

package org.xdi.oxauth.client;

import org.apache.http.client.CookieStore;

/**
 * @author Yuriy Zabrovarnyy
 * @version 0.9, 15/03/2013
 */

public class ClientUtils {
    private ClientUtils() {
    }

    public static void showClient(BaseClient client) {
        System.out.println("-------------------------------------------------------");
        System.out.println("REQUEST:");
        System.out.println("-------------------------------------------------------");
        System.out.println(client.getRequestAsString());
        System.out.println("");

        System.out.println("-------------------------------------------------------");
        System.out.println("RESPONSE:");
        System.out.println("-------------------------------------------------------");
        System.out.println(client.getResponseAsString());
		if (client.getResponse() != null) {
			System.out.println("RAW HEADERS:");
			System.out.println(client.getResponse().getHeaders());
		}
        System.out.println("");
    }

    public static void showClientUserAgent(BaseClient client) {
        System.out.println("-------------------------------------------------------");
        System.out.println("REQUEST:");
        System.out.println("-------------------------------------------------------");
        System.out.println(client.getUrl() + "?" + client.getRequest().getQueryString());
        System.out.println("");

        if (client.getResponse() != null) {
	        System.out.println("-------------------------------------------------------");
	        System.out.println("RESPONSE:");
	        System.out.println("-------------------------------------------------------");
	        System.out.println("HTTP/1.1 302 Found");
	        System.out.println("Location: " + client.getResponse().getLocation());
	        System.out.println("");
        }
    }

    public static void showClient(BaseClient client, CookieStore cookieStore) {
        showClient(client);

        System.out.println("-------------------------------------------------------");
        System.out.println("COOKIES:");
        System.out.println("-------------------------------------------------------");
        System.out.println(cookieStore.getCookies());
        System.out.println("");
    }
}
