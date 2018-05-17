package com.paul.algorithm.sort

import scala.math.Ordering

object ArrayUtil {
  implicit class ArrayExtension[T](array: Array[T]) {
    def isSorted[U >: T](implicit ord: Ordering[U]): Boolean = {
      if (array.length > 1) {
        !(array zip array.slice(1, array.length)).exists((pair) => ord.lt(pair._2, pair._1))
      }
      else {
        true
      }
    }
  }
}

