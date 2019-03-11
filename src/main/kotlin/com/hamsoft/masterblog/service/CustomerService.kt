package com.hamsoft.masterblog.service

import com.hamsoft.masterblog.entity.Customer

/**
 *  Created By kabiruahmed on Mar 2019
 */    
    
interface  CustomerService{

    fun  addCustomer(customer: Customer)

    fun  getAllCustomer() : MutableList<Customer>

    fun  getCustomerById(id : Long ) : Customer

    fun  deleteCustomer(id : Long)

}