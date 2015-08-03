package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyHuffmanSuite extends FunSuite {

  import patmat.Huffman._
  
  test("times") {
    assert(times(List('a', 'b', 'a')) === List(('a', 2), ('b', 1)))
  }
}