package edu.knoldus

import org.apache.log4j.Logger


object Activity  {

   def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)
    val process = new Activity
    val index = 3
    val firstElement = "a"
    val secondElement = "b"
    val thirdElement = "c"
    val fourthElement = "d"
    val fifthElement = "e"
    val list = List(firstElement, secondElement, thirdElement, fourthElement, fifthElement)
    log.info("Rotated list \n" + process.rotateTheList(index, list))
    val list1 = 1
    val list2 = 2
    val list3 = 2
    val list4 = 3
    val list5 = 4
    val oldList = List(list1, list2, list3, list4, list5)
    val newlist = List()
    log.info("Removing duplicates elements" + process.removeDuplicates(oldList, newlist))

  }
}

  class Activity {
    def rotateTheList(currentIndex: Int, list: List[String]): List[String] = {
      list match {
        case head :: tail if currentIndex != 0 => rotateTheList(currentIndex - 1,tail :+ head)
        case Nil => list
      }
    }

    def removeDuplicates(list: List[Int],newList: List[Int]): List[Int] = {
      list match {
        case head :: head2 :: tail if(head == head2) => removeDuplicates(head2 :: tail, newList)
        case head :: head2 :: tail if(head != head2) => removeDuplicates(head2 :: tail, newList :+ head)
        case head :: Nil => newList :+ head
      }
    }

  }


