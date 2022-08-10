package com.vgtech.vks.service.mapper;

import com.vgtech.vks.domain.MemberLandAssets;
import com.vgtech.vks.service.dto.MemberLandAssetsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MemberLandAssets} and its DTO {@link MemberLandAssetsDTO}.
 */
@Mapper(componentModel = "spring")
public interface MemberLandAssetsMapper extends EntityMapper<MemberLandAssetsDTO, MemberLandAssets> {}
