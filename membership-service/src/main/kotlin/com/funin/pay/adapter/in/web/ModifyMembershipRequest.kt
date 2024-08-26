package com.funin.pay.adapter.`in`.web

data class ModifyMembershipRequest(
    val membershipId: String,
    val name: String,
    val address: String,
    val email: String,
    val isCorp: Boolean
)