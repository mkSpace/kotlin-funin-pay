package com.funin.pay.application.port.`in`

import common.SelfValidating

data class FindMembershipCommand(val membershipId: Long) : SelfValidating<FindMembershipCommand>() {
    init {
        validateSelf()
    }
}