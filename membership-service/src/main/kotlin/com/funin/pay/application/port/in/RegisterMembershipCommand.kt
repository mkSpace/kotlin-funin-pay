package com.funin.pay.application.port.`in`

import common.SelfValidating
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank

class RegisterMembershipCommand(
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val email: String,

    @field:NotBlank
    val address: String,

    @field:AssertTrue
    val isValid: Boolean,

    val isCorp: Boolean,
) : SelfValidating<RegisterMembershipCommand>() {
    init {
        validateSelf()
    }
}