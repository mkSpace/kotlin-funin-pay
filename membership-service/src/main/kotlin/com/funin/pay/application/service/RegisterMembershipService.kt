package com.funin.pay.application.service

import com.funin.pay.adapter.out.persistence.toDomainEntity
import com.funin.pay.application.port.`in`.RegisterMembershipCommand
import com.funin.pay.application.port.`in`.RegisterMembershipUseCase
import com.funin.pay.application.port.out.RegisterMembershipPort
import com.funin.pay.common.UseCase
import com.funin.pay.domain.Membership
import org.springframework.transaction.annotation.Transactional

@Transactional
@UseCase
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort
) : RegisterMembershipUseCase {
    override fun registerMembership(command: RegisterMembershipCommand): Membership {
        return registerMembershipPort.createMembership(
            name = command.name,
            email = command.email,
            address = command.address,
            isValid = command.isValid,
            isCorp = command.isCorp
        ).toDomainEntity()
    }
}