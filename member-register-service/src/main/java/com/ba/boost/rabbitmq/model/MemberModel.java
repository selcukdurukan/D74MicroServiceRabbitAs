package com.ba.boost.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberModel implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
}
