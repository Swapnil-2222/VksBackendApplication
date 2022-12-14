package com.vgtech.vks.service.mapper;

import com.vgtech.vks.domain.Society;
import com.vgtech.vks.service.dto.SocietyDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Society} and its DTO {@link SocietyDTO}.
 */
@Mapper(componentModel = "spring")
public interface SocietyMapper extends EntityMapper<SocietyDTO, Society> {
    @Mapping(target = "society", source = "society", qualifiedByName = "societyId")
    SocietyDTO toDto(Society s);

    @Named("societyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    SocietyDTO toDtoSocietyId(Society society);
}
