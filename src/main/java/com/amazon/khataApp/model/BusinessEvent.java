package com.amazon.khataApp.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This is an entity class which will be stored in our  database
 * @Entity will automatically make this model as an entity and send it  to database when object created
 * @Data contains hashCode, toSting and all Geters and Seters
 * both no argument and all argument constructor is defined using annotation
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class BusinessEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private SourceId sourceId;

    private EventType eventType;

    private String currency;

    private Long amount;

    private String marketplace;

    private Long advertiserId;

    private Long invoiceId;

    private Long programId;

    private String channel;

    private Boolean success;

    private int creditAccount;

    private int debitAccount;

    @CreationTimestamp
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}



