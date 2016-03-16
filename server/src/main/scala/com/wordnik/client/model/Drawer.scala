package com.wordnik.client.model

import com.wordnik.client.model.Promoter
import java.util.Date


case class Drawer (
  id: Int,
  dateAdded: Date,
  promoter: Promoter
)
