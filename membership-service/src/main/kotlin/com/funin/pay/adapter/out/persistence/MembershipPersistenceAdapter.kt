package com.funin.pay.adapter.out.persistence

import com.funin.pay.application.port.out.FindMembershipPort
import com.funin.pay.application.port.out.RegisterMembershipPort
import common.PersistenceAdapter
import org.springframework.data.repository.findByIdOrNull

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: SpringDataMembershipRepository
) : RegisterMembershipPort, FindMembershipPort {
    override fun createMembership(
        name: String,
        email: String,
        address: String,
        isValid: Boolean,
        isCorp: Boolean
    ): MembershipJpaEntity {
        return membershipRepository.save(
            MembershipJpaEntity(name, address, email, isValid, isCorp)
        )
    }

    override fun findMembership(membershipId: Long): MembershipJpaEntity {
        return membershipRepository.findByIdOrNull(membershipId)
            ?: throw IllegalArgumentException("No matching membership found with id: $membershipId")
    }
}