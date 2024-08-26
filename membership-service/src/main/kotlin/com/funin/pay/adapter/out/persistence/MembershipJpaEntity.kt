package com.funin.pay.adapter.out.persistence

import jakarta.persistence.*

@Entity
@Table(name = "membership")
class MembershipJpaEntity(
    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "address", nullable = false)
    var address: String,

    @Column(name = "email", nullable = false)
    var email: String,

    @Column(name = "is_valid", nullable = false)
    var isValid: Boolean,

    @Column(name = "is_corp", nullable = false)
    var isCorp: Boolean,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0L
)