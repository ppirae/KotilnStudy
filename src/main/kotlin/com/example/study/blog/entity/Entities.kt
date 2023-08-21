package com.example.study.blog.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Wordcount(
    @Id var word: String,
    var cnt: Int = 0
)