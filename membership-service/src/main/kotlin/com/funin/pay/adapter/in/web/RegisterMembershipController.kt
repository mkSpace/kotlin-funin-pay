package com.funin.pay.adapter.`in`.web

import com.funin.pay.application.port.`in`.RegisterMembershipCommand
import com.funin.pay.application.port.`in`.RegisterMembershipUseCase
import com.funin.pay.common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController(private val registerMembershipUseCase: RegisterMembershipUseCase) {

    @PostMapping("/membership/register")
    fun registerMembership(@RequestBody request: RegisterMembershipRequest) {
        val command = RegisterMembershipCommand(
            name = request.name,
            address = request.address,
            email = request.email,
            isValid = true,
            isCorp = request.isCorp
        )
        registerMembershipUseCase.registerMembership(command)
    }
}