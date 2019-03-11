package com.hamsoft.masterblog.controller

import com.hamsoft.masterblog.entity.Customer
import com.hamsoft.masterblog.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *  Created By kabiruahmed on Mar 2019
 */

@RestController
@RequestMapping("/customers")
class CustomerController{

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun findAll() = customerService.getAllCustomer();

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable("id") id: Long) = customerService.getCustomerById(id)

    @PostMapping
    fun saveCustomer(@RequestBody customer: Customer) = customerService.addCustomer(customer)

    fun deleteCustomer(id : Long ) = customerService.deleteCustomer(id)

}