/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesoap;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ServeurJAXWS {
    public static void main(String[] args) {
        String url="http://localhost:8585/";
        Endpoint.publish(url, new AppelServiceSoap());
        System.out.println("url = "+url);
    }
}
