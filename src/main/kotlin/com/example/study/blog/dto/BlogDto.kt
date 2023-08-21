package com.example.study.blog.dto

import com.example.kakaoapi.core.annotation.ValidEnum
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

data class BlogDto (
    @field:NotBlank(message = "query parameter required")
    val query: String?,

    @field:NotBlank(message = "sort parameter required")
    @field:ValidEnum(enumClass = EnumSort::class, message = "sort parameter one of ACCURACY and RECENCY")
    val sort: String?,

    @field:NotBlank(message = "page parameter required")
    @field:Max(50, message = "page is more than max")
    @field:Min(1, message = "page is less than min")
    val page: Int?,

    @field:NotBlank(message = "size parameter required")
    val size: Int?
) {
    private enum class EnumSort {
        ACCURACY,
        RECENCY
    }
}