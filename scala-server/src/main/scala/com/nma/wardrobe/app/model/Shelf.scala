package com.nma.wardrobe.app.model

import com.nma.wardrobe.app.model.Drawer
import com.nma.wardrobe.app.model.Promoter


case class Shelf (
  id: Long,
  name: String,
  url: String,
  promoters: List[Promoter],
  drawers: List[Drawer],
  latest: Drawer
)
