package org.maverick.services;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Startup
@Singleton
public class MessageSenderService {

    private static final Logger LOG = LogManager.getLogger(MessageSenderService.class);
    
    @EJB
    private MessageSenderBean msgSender;
    
    @PostConstruct
    public void init() {
    	LOG.info("Injecting and calling MessageSenderBean class");
    	msgSender.SendMessage();
    }

}
