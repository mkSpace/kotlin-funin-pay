package com.funin.pay.adapter.out.persistence

import com.funin.pay.domain.Membership

fun MembershipJpaEntity.toDomainEntity(): Membership {
    return Membership(
        membershipId = id,
        name = name,
        email = email,
        address = address,
        isValid = isValid,
        isCorp = isCorp
    )
}