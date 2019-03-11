package com.hamsoft.masterblog.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

/**
 *  Created By kabiruahmed on Mar 2019
 */    

@Entity
data class Customer(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @NotBlank
    var firstName : String,

    @NotBlank
    var lastName :String,

    var address : String,

    var phoneNumber : String

) : Serializable