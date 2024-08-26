package com.funin.pay.application.port.`in`

import com.funin.pay.domain.Membership

interface RegisterMembershipUseCase {

    fun registerMembership(command: RegisterMembershipCommand): Membership

}