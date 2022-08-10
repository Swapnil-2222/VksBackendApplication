package com.vgtech.vks.service.mapper;

import com.vgtech.vks.domain.MemberBank;
import com.vgtech.vks.service.dto.MemberBankDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MemberBank} and its DTO {@link MemberBankDTO}.
 */
@Mapper(componentModel = "spring")
public interface MemberBankMapper extends EntityMapper<MemberBankDTO, MemberBank> {}
