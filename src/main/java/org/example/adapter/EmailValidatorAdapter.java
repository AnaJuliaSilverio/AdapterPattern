package org.example.adapter;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class EmailValidatorAdapter implements EmailValidator {
    public boolean isEmail(String value) {
        try{
            InternetAddress emailAddr = new InternetAddress(value);
            emailAddr.validate();
            return true;
        }catch(AddressException ex){
            return false;
        }
    }
}
