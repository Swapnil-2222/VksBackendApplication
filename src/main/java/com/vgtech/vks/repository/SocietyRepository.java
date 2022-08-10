package com.vgtech.vks.repository;

import com.vgtech.vks.domain.Society;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Society entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SocietyRepository extends JpaRepository<Society, Long>, JpaSpecificationExecutor<Society> {}
