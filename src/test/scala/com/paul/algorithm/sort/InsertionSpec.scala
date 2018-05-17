package com.paul.algorithm.sort

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

import com.paul.algorithm.sort.Insertion._
import com.paul.algorithm.sort.ArrayUtil._

object InsertionSpec extends Properties("Insertion sort"){
  property("sort") = forAll { (items: Array[Int]) =>
    val result = sort(items)

    result.isSorted
  }
}
