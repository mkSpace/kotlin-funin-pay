package com.funin.pay.application.port.`in`

import com.funin.pay.domain.Membership

interface ModifyMembershipUseCase {
    fun modifyMembership(command: ModifyMembershipCommand): Membership
}