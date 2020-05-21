package com.amazon.khataApp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-21T08:57:04+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class BusinessEventMapperImpl implements BusinessEventMapper {

    @Override
    public BusinessEventDTO toBusinessEventDTO(BusinessEvent product) {
        if ( product == null ) {
            return null;
        }

        BusinessEventDTO businessEventDTO = new BusinessEventDTO();

        return businessEventDTO;
    }

    @Override
    public List<BusinessEventDTO> toBusinessEventDTOs(List<BusinessEvent> products) {
        if ( products == null ) {
            return null;
        }

        List<BusinessEventDTO> list = new ArrayList<BusinessEventDTO>( products.size() );
        for ( BusinessEvent businessEvent : products ) {
            list.add( toBusinessEventDTO( businessEvent ) );
        }

        return list;
    }

    @Override
    public BusinessEvent toBusinessEvent(BusinessEventDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        BusinessEvent businessEvent = new BusinessEvent();

        return businessEvent;
    }
}
