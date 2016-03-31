package com.nma.wardrobe.client.model

import com.nma.wardrobe.client.model.Shelf

case class Stack (
  id: Int,
  name: String,
  authGroup: String,
  shelves: List[Shelf]
)
