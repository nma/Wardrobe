package com.wordnik.client.model



case class User (
  id: Long,
  firstName: String,
  lastName: String,
  email: String,
  password: String,
  userGroup: String,
  userStatus: Int
)
