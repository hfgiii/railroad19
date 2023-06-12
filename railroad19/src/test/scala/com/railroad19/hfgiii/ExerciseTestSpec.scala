package com.railroad19.hfgiii

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExerciseTestSpec extends AnyFlatSpec with Matchers {

  /////////////////////////////////////////////////////////////////////////////


  "Range" should "be the difference between the largest and smallest numbers" in {
    range(3, 17, 15, 11, 9) should be(14)
  }

  def range(numbers: Int*): Int = {
    if (numbers.nonEmpty) {
      val s = numbers.sorted
      s.last - s.head
    } else 0
  }


  /////////////////////////////////////////////////////////////////////////////


  "Mean" should "be the average of the numbers" in {
    mean(13, 19, null, 14, 16, 5, 8) should be(12.5)
  }

  def mean(numbers: Integer*): Double = {
    val (avg, sz) =
      numbers.foldRight((0d, 0))((m, d) => Option(m).map(a => (a + d._1, d._2 + 1)).getOrElse(d))
    avg / sz
  }

  /////////////////////////////////////////////////////////////////////////////


  "Median" should "be the middle number in a sorted list when there is only one middle number" in {
    median(7, 11, 6, 2, 5) should be(6)
  }
  "Median" should "be the average of the middle numbers in a sorted list when there are two middle numbers" in {
    median(13, 18, 14, 16, 5, 8) should be(13)
  }

  def median(numbers: Int*): Double = {
    val nsorted = numbers.sorted
    val nsize = nsorted.size
    if (nsize % 2 == 0)
      (nsorted(nsize / 2 - 1) + nsorted(nsize / 2)) / 2
    else nsorted(nsize / 2)
  }


  /////////////////////////////////////////////////////////////////////////////


  "Mode" should "be the most commonly occurring number(s) in a list" in {
    mode(5, 2, 3, 6, 4, 1, 3) should be(Array(3))
    mode(4, 5, 3, 1, 3, 2, 5, 6) should be(Array(5, 3))
    mode(4, 5, 5, 3, 1, 3, 2, 5, 6) should be(Array(5))
    mode(1, 3, 2, 4, 5) should be(Array(5, 1, 2, 3, 4))
  }

  def mode(numbers: Int*): Array[Int] = {
    val freqMap = {
      numbers.foldRight(Map.empty[Int, Int]) { (n, m) =>
        m.get(n).map { v =>
          m + (n -> (v + 1))
        }.getOrElse(m + (n -> 1))
      }
    }
    val grpMap = freqMap.groupBy(_._2)
    val maxKey = grpMap.keysIterator.max
    grpMap(maxKey).keys.toArray
  }

}

/////////////////////////////////////////////////////////////////////////////



