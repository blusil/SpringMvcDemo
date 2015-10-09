package org.maverick.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Stateless
@LocalBean
public class MessageSenderBean {

    private static final Logger LOG = LogManager.getLogger(MessageSenderBean.class);
    
    public void SendMessage() {
    	LOG.info("This is a test message");
    }
}
