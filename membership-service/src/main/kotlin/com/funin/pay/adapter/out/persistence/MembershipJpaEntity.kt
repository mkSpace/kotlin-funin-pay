package com.funin.pay.adapter.out.persistence

import jakarta.persistence.*

@Entity
@Table(name = "membership")
class MembershipJpaEntity(
    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "address", nullable = false)
    val address: String,

    @Column(name = "email", nullable = false)
    val email: String,

    @Column(name = "is_valid", nullable = false)
    val isValid: Boolean,

    @Column(name = "is_corp", nullable = false)
    val isCorp: Boolean,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0L
)