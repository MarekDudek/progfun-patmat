package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyHuffmanSuite extends FunSuite {

  import patmat.Huffman._

  val shortList = List('a', 'b', 'a')
  val shortFreq = List(('a', 2), ('b', 1))

  test("times") {
    assert(times(shortList) === shortFreq)
  }

  test("leaf list") {
    assert(makeOrderedLeafList(shortFreq) === List(Leaf('b', 1), Leaf('a', 2)))
  }
}