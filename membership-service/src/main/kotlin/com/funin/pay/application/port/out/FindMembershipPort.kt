package com.funin.pay.application.port.out

import com.funin.pay.adapter.out.persistence.MembershipJpaEntity

interface FindMembershipPort {
    fun findMembership(membershipId: Long): MembershipJpaEntity
}