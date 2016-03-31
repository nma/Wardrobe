package com.nma.wardrobe.client.model

import com.nma.wardrobe.client.model.Promoter
import java.util.Date


case class Drawer (
  id: Int,
  dateAdded: Date,
  promoter: Promoter
)
