package com.esgi.kafkaproducer.Exposition;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subscriber {

    private String subscriberRef;
    private String subscriberType;
    private String customerRef;
    private String contactPerson;
    private Ccuid ccuid;


    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberRef='" + subscriberRef + '\'' +
                ", subscriberType='" + subscriberType + '\'' +
                ", customerRef='" + customerRef + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", ccuid=" + ccuid +
                '}';
    }
}
