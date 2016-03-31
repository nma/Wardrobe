package com.nma.wardrobe.client.model

import com.nma.wardrobe.client.model.Drawer
import com.nma.wardrobe.client.model.Promoter


case class Shelf (
  id: Long,
  name: String,
  url: String,
  promoters: List[Promoter],
  drawers: List[Drawer],
  latest: Drawer
)
