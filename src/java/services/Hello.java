/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Eskindir
 */
@WebService
public class Hello {
    
    public Hello(){}

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
