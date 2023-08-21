package com.example.study.core.response

data class ErrorResponse (
    var message: String,
    var errorType: String = "Invalid Argument"
)