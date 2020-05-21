package com.amazon.khataApp.model;

import lombok.Data;

@Data
public class BusinessEventDTO {

    private SourceId sourceId;

    private EventType eventType;

    private String currency;

    private Long amount;

    private String marketplace;

    private Long advertiserId;

    private Long invoiceId;

    private Long programId;

    private String channel;

}
