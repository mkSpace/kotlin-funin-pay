package com.funin.pay.adapter.out.persistence

import com.funin.pay.application.port.out.FindMembershipPort
import com.funin.pay.application.port.out.ModifyMembershipPort
import com.funin.pay.application.port.out.RegisterMembershipPort
import com.funin.pay.common.PersistenceAdapter
import org.springframework.data.repository.findByIdOrNull

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: SpringDataMembershipRepository
) : RegisterMembershipPort, FindMembershipPort, ModifyMembershipPort {
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

    override fun findMembership(id: Long): MembershipJpaEntity {
        return membershipRepository.findByIdOrNull(id)
            ?: throw IllegalArgumentException("No matching membership found with id: $id")
    }

    override fun modifyMembership(
        id: Long,
        name: String,
        email: String,
        address: String,
        isValid: Boolean,
        isCorp: Boolean
    ): MembershipJpaEntity {
        val entity = membershipRepository.findByIdOrNull(id)
            ?: throw IllegalArgumentException("No matching membership found with id: $id")

        entity.name = name
        entity.email = email
        entity.address = address
        entity.isValid = isValid
        entity.isCorp = isCorp

        return membershipRepository.save(entity)
    }
}