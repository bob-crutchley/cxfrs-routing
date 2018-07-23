package org.bob.cxfrs.beans;

import org.apache.camel.builder.RouteBuilder;

public class AuditServiceRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new EmployeeServiceProcessor());
    }
}
