package com.funin.pay.adapter.`in`.web

import com.funin.pay.application.port.`in`.FindMembershipCommand
import com.funin.pay.application.port.`in`.FindMembershipUseCase
import com.funin.pay.common.WebAdapter
import com.funin.pay.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@WebAdapter
class FindMembershipController(private val findMembershipUseCase: FindMembershipUseCase) {

    @GetMapping("/membership/{membershipId}")
    fun findMembershipByMemberId(
        @PathVariable membershipId: Long
    ): ResponseEntity<Membership> {
        val command = FindMembershipCommand(membershipId)
        return ResponseEntity.ok(findMembershipUseCase.findMembership(command))
    }

}