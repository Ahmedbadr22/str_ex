package com.ab.data

import com.ab.domain.model.Customer
import com.ab.domain.repo.CustomerRepository

class CustomerRepositoryImpl : CustomerRepository {
    override fun getCustomer() : Customer {
        val customerDto = CustomerDto("Ahmed")
        return customerDto.toCustomer()
    }

}