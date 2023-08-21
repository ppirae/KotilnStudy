package com.example.study.core.exception

import java.lang.RuntimeException

class InvalidInputException (
    message: String = "Invalid Input"
): RuntimeException(message)