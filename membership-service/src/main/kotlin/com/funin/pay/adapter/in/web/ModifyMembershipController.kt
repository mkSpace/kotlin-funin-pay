package com.funin.pay.adapter.`in`.web

import com.funin.pay.application.port.`in`.ModifyMembershipCommand
import com.funin.pay.application.port.`in`.ModifyMembershipUseCase
import com.funin.pay.common.WebAdapter
import com.funin.pay.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class ModifyMembershipController(private val modifyMembershipUseCase: ModifyMembershipUseCase) {

    @PostMapping("/membership/modify/{membershipId}")
    fun modifyMembershipById(
        @PathVariable membershipId: Long,
        @RequestBody request: ModifyMembershipRequest
    ): ResponseEntity<Membership> {
        val command = ModifyMembershipCommand(
            membershipId = membershipId,
            name = request.name,
            email = request.email,
            address = request.address,
            isValid = true, isCorp = request.isCorp
        )
        return ResponseEntity.ok(modifyMembershipUseCase.modifyMembership(command))
    }

}