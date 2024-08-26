package com.funin.pay.application.port.`in`

import com.funin.pay.common.SelfValidating

data class FindMembershipCommand(val membershipId: Long) : SelfValidating<FindMembershipCommand>() {
    init {
        validateSelf()
    }
}