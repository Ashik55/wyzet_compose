package com.aashiq.wyzet.common.base

interface Mapper<F, T> {
    fun mapFrom(from: F): T

}