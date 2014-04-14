/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author Administrator
 */
@MessageDriven(mappedName = "jms/msg", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MessageBean implements MessageListener {
    
    public MessageBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage msg=(TextMessage)message;
            System.out.println(msg.getText());
        } catch (JMSException ex) {
            Logger.getLogger(MessageBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
