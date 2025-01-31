package org.example.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Customer.class)
public interface CustomerProjection {
    String getName();
    String getEmail();

    //when we access the link /1?projection=all it would display only the name and the email
}
