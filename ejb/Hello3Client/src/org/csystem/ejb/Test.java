package org.csystem.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Test {

	public static void main(String[] args) {
		InitialContext ctx;
        try {
            ctx = new InitialContext();
            Hello3SesRemote bean = (Hello3SesRemote) ctx
                    .lookup("org.csystem.ejb.Hello3SesRemote");
            System.out.println(bean.topla(3, 5));
            System.out.println("Bitti..");
        } catch (NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("hatali..");
        }

	}

}
