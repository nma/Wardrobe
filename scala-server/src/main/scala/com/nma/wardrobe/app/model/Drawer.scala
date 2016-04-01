package com.nma.wardrobe.app.model

import com.nma.wardrobe.app.model.Promoter
import java.util.Date


case class Drawer (
  id: Int,
  dateAdded: Date,
  promoter: Promoter
)
