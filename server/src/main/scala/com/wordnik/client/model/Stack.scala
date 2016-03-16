package com.wordnik.client.model

import com.wordnik.client.model.Shelf


case class Stack (
  id: Int,
  name: String,
  authGroup: String,
  shelves: List[Shelf]
)
