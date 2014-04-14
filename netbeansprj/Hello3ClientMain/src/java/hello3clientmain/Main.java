/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello3clientmain;

import javax.ejb.EJB;
import org.csystem.ejb.Hello3SesRemote;

/**
 *
 * @author Administrator
 */
public class Main {
    @EJB
    private static Hello3SesRemote hello3Ses;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hello3Ses.topla(3, 4));
    }
}
