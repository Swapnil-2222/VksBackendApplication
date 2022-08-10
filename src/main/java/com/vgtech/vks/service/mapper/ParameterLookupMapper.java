package com.vgtech.vks.service.mapper;

import com.vgtech.vks.domain.ParameterLookup;
import com.vgtech.vks.service.dto.ParameterLookupDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ParameterLookup} and its DTO {@link ParameterLookupDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterLookupMapper extends EntityMapper<ParameterLookupDTO, ParameterLookup> {}
