package com.jd.algorithms

import org.junit.Assert
import org.junit.Test

class ParindromeScala {

  def palindrome(s: String): Boolean = {
    var i = 0
    var j = s.length() - 1
    while (i <= j) {
      if (s.charAt(i) == s.charAt(j)) {
        i += 1
        j -= 1
      } else {
        return false
      }
    }
    return true
  }

  @Test def test1() {
    Assert.assertTrue(palindrome("abba"))
  }

  @Test def test2() {
    Assert.assertFalse(palindrome("abbab"))
  }

  @Test def test3() {
    Assert.assertTrue(palindrome("abccba"))
  }
}