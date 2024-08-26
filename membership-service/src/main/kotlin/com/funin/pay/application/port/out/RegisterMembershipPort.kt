package com.funin.pay.application.port.out

import com.funin.pay.adapter.out.persistence.MembershipJpaEntity

interface RegisterMembershipPort {

    fun createMembership(
        name: String,
        email: String,
        address: String,
        isValid: Boolean,
        isCorp: Boolean
    ): MembershipJpaEntity

}