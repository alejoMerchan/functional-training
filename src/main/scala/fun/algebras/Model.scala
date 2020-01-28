package fun.algebras

import java.util.UUID

import io.estatico.newtype.macros.newtype

class Model {

}

@newtype case class Brand(value: String)

@newtype case class Category(value: String)

@newtype case class ItemId(value: UUID)

@newtype case class ItemName(value: String)

@newtype case class ItemDescription(value: String)

