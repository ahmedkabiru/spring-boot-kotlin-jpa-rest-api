package com.hamsoft.masterblog.service.impl

import com.hamsoft.masterblog.entity.Customer
import com.hamsoft.masterblog.repository.CustomerRepository
import com.hamsoft.masterblog.service.CustomerService
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 *  Created By kabiruahmed on Mar 2019
 */    

@Service
@Transactional
@RequiredArgsConstructor
class CustomerServiceImpl(private val customerRepository: CustomerRepository):CustomerService {


    override fun addCustomer(customer: Customer ) {
        customerRepository.save(customer)
    }

    @Transactional(readOnly = true)
    override fun getAllCustomer() : MutableList<Customer> {
       return customerRepository.findAll()
    }

    override fun getCustomerById(id: Long) : Customer {
       return  customerRepository.getOne(id)
    }

    override fun deleteCustomer(id: Long) {
        customerRepository.findById(id)
    }

}