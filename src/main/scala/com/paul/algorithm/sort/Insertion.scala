package com.paul.algorithm.sort

import scala.math.Ordering

object Insertion {
  def sort[T, U >: T](items: Array[T])(implicit ord: Ordering[U]): Array[T] = {
    val result = items.clone()

    for (i <- 0 until result.length) {
      var j = i

      while (j > 0 && ord.lt(result(j), result(j - 1))) {
        val temp = result(j)
        result(j) = result(j - 1)
        result(j - 1) = temp
        j -= 1
      }
    }

    result
  }
}
