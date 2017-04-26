package com.criteo.slab.core

import com.criteo.slab.utils.Jsonable
import org.json4s.Serializer

case class Column(percentage: Double, rows: Seq[Row])

case class Row(title: String, percentage: Double = 100, boxes: Seq[Box])

case class Layout(columns: Seq[Column])

object Layout {

  implicit object ToJSON extends Jsonable[Layout] {
    override val serializers: Seq[Serializer[_]] = implicitly[Jsonable[Box]].serializers
  }
}