package com.amazon.khataApp.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusinessEventMapper {
    BusinessEventDTO toBusinessEventDTO(BusinessEvent product);

    List<BusinessEventDTO> toBusinessEventDTOs(List<BusinessEvent> products);

    BusinessEvent toBusinessEvent(BusinessEventDTO productDTO);
}
