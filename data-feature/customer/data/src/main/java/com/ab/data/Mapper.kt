package com.ab.data

import com.ab.domain.model.Customer

fun CustomerDto.toCustomer() = Customer(name)