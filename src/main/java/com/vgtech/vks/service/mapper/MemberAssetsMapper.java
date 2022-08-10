package com.vgtech.vks.service.mapper;

import com.vgtech.vks.domain.Member;
import com.vgtech.vks.domain.MemberAssets;
import com.vgtech.vks.service.dto.MemberAssetsDTO;
import com.vgtech.vks.service.dto.MemberDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MemberAssets} and its DTO {@link MemberAssetsDTO}.
 */
@Mapper(componentModel = "spring")
public interface MemberAssetsMapper extends EntityMapper<MemberAssetsDTO, MemberAssets> {
    @Mapping(target = "member", source = "member", qualifiedByName = "memberId")
    MemberAssetsDTO toDto(MemberAssets s);

    @Named("memberId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    MemberDTO toDtoMemberId(Member member);
}
