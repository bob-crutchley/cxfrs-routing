package com.javainuse;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {
    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new CamelProcessor());
    }
}
