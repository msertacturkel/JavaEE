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
import javax.jms.ObjectMessage;

/**
 *
 * @author Administrator
 */
@MessageDriven(mappedName = "jms/msg", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class NewsBean implements MessageListener {

    public NewsBean() {
    }

    @Override
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            try {
                ObjectMessage msg = (ObjectMessage) message;
                NewsEntity e = (NewsEntity) msg.getObject();
                System.out.println(e);
            } catch (JMSException ex) {
                Logger.getLogger(NewsBean.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
