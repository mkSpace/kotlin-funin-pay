package com.funin.pay.application.service

import com.funin.pay.adapter.out.persistence.toDomainEntity
import com.funin.pay.application.port.`in`.ModifyMembershipCommand
import com.funin.pay.application.port.`in`.ModifyMembershipUseCase
import com.funin.pay.application.port.out.ModifyMembershipPort
import com.funin.pay.common.UseCase
import com.funin.pay.domain.Membership
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class ModifyMembershipService(private val modifyMembershipPort: ModifyMembershipPort) : ModifyMembershipUseCase {

    override fun modifyMembership(command: ModifyMembershipCommand): Membership {
        return modifyMembershipPort.modifyMembership(
            id = command.membershipId,
            name = command.name,
            email = command.email,
            address = command.address,
            isValid = command.isValid,
            isCorp = command.isCorp
        ).toDomainEntity()
    }
}