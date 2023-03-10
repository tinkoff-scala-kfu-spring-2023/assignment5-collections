package collections

object Collections {

  // Return a tail of a list
  def tail[A](l: List[A]): List[A] = ???

  // Set a head of a list to a new one
  def setHead[A](l: List[A], h: A): List[A] = ???

  // Drop n elements of the list. If there are
  // less than n elements - just return None
  def drop[A](l: List[A], n: Int): List[A] = ???

  // Drop elements while they satisfy the condition
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = ???

  // Return all the elements of the list except the last one
  // If None - return None
  def init[A](l: List[A]): List[A] = ???

  // Return the length of the list
  def length[A](l: List[A]): Int = ???

  // Traverse the list, accumulating value z, using some function f
  // Try making it tail recursive
  def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = ???

  // Map elements of type A to elements of type B
  def map[A, B](l: List[A])(f: A => B): List[B] = ???

  /*
    In a sorted list find all pairs of two neighbor numbers which have a gap between them
    None for Seq(1, 2, 3, 4)
    Some(Seq((2, 8))) for Seq(1, 2, 8)
    Some(Seq((3, 5), (5, 7))) for Seq(3, 5, 7)
   */
  def findGaps(l: Seq[Int]): Option[Seq[(Int, Int)]] = {
    ???
  }

  /*
    Find key-value pair with the minimum value in the map
    try to implement min in different ways (fold, reduce, recursion)
  */
  def minFold(map: Map[String, Int]): Option[(String, Int)] = {
    ???
  }

  def minReduce(map: Map[String, Int]): Option[(String, Int)] = {
    ???
  }

  def minRecursion(map: Map[String, Int]): Option[(String, Int)] = ???

  // Implement scanLeft (not using scans ofc)
  def scanLeft[T](zero: T)(list: Seq[T])(f: (T, T) => T): Seq[T] = {
    ???
  }

  // Count the consistent occurences of each character in the string
  def count(s: String): List[(Char, Int)] = {
    ???
  }
}
