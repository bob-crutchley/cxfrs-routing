package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AuditServiceProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
		// TODO find a way too look at the data that has been passed
        String msg = exchange.getIn().getBody(String.class);
        exchange.getOut().setBody("Message:\n" + msg);
    }
}
