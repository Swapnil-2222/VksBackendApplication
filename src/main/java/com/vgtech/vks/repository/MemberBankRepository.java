package com.vgtech.vks.repository;

import com.vgtech.vks.domain.MemberBank;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the MemberBank entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MemberBankRepository extends JpaRepository<MemberBank, Long>, JpaSpecificationExecutor<MemberBank> {}
