package com.funin.pay.application.port.out

import com.funin.pay.adapter.out.persistence.MembershipJpaEntity

interface ModifyMembershipPort {

    fun modifyMembership(
        id: Long,
        name: String,
        email: String,
        address: String,
        isValid: Boolean,
        isCorp: Boolean
    ): MembershipJpaEntity

}