package com.funin.pay.application.service

import com.funin.pay.adapter.out.persistence.toDomainEntity
import com.funin.pay.application.port.`in`.FindMembershipCommand
import com.funin.pay.application.port.`in`.FindMembershipUseCase
import com.funin.pay.application.port.out.FindMembershipPort
import com.funin.pay.common.UseCase
import com.funin.pay.domain.Membership
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional(readOnly = true)
class FindMembershipService(val findMembershipPort: FindMembershipPort) : FindMembershipUseCase {
    override fun findMembership(command: FindMembershipCommand): Membership {
        return findMembershipPort.findMembership(command.membershipId).toDomainEntity()
    }
}