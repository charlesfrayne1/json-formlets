package gov.wicourts.json

import argonaut.Json

package object formlet {
  type FieldFormlet[A] = Formlet[Json, JsonObjectBuilder, A, FieldView]

  type ObjectFormlet[A] = Formlet[Json, JsonObjectBuilder, A, JsonObjectBuilder]

  object syntax extends ToFieldFormletOps
}
