package com.nma.wardrobe.app.model

import com.nma.wardrobe.app.model.Shelf

case class Stack (
  id: Int,
  name: String,
  authGroup: String,
  shelves: List[Shelf]
)
