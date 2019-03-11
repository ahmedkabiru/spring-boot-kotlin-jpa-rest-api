package com.hamsoft.masterblog.repository

import com.hamsoft.masterblog.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

/**
 *  Created By kabiruahmed on Mar 2019
 */    
    
interface  CustomerRepository : JpaRepository<Customer,Long>

