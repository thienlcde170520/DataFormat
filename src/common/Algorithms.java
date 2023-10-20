
package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Algorithms {
    private Library l;
    
    public Algorithms(){
        l = new Library();
    }
    public String checkPhoneNumberFormat(String phoneNumber) {
        if (!phoneNumber.matches("^[0-9]+$")) {
            return "Phone number must be number";
        }
        if (!phoneNumber.matches("^\\d{10}$")) {
            return "Phone number must be 10 digits";
        }

        return "";
    }

    public String checkEmailFormat(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "Email must be correct format";
        }
        return "";
    }

    public String checkDateFormat(String date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        f.setLenient(false);
        try {
            f.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
    }
    
    public void check(){
        String phone;
        do {
            phone = l.getString("Phone: ");
            if (!checkPhoneNumberFormat(phone).equals("")) {
                System.out.println(checkPhoneNumberFormat(phone));
            } else {
                System.out.println("Phone is correct format.");
                break;
            }
        } while (true);

        String email;
        do {
            email = l.getString("Email: ");
            if (!checkEmailFormat(email).equals("")) {
                System.out.println(checkEmailFormat(email));
            } else {
                System.out.println("Email is correct format.");
                break;
            }
        } while (true);

        String date;
        do {
            date = l.getString("Date: ");
            if (!checkDateFormat(date).equals("")) {
                System.out.println(checkDateFormat(date));
            } else {
                System.out.println("Date is correct format.");
                break;
            }
        } while (true);

    }
}

