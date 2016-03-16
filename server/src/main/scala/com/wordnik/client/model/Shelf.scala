package com.wordnik.client.model

import com.wordnik.client.model.Drawer
import com.wordnik.client.model.Promoter


case class Shelf (
  id: Long,
  name: String,
  url: String,
  promoters: List[Promoter],
  drawers: List[Drawer],
  latest: Drawer
)
