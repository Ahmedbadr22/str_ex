package com.ab.domain.repo

import com.ab.domain.model.Customer

interface CustomerRepository {

    fun getCustomer() : Customer
}