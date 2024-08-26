package com.funin.pay.application.port.`in`

import com.funin.pay.domain.Membership

interface FindMembershipUseCase {
    fun findMembership(command: FindMembershipCommand): Membership
}