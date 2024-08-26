package com.funin.pay.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataMembershipRepository : JpaRepository<MembershipJpaEntity, Long>