def rotateTheList(currentIndex: Int, list: List[String]): List[String] = {
  list match {
    case head :: tail if (currentIndex != 0) => rotateTheList(currentIndex - 1, tail :+ head)
    case Nil => list
  }}

rotateTheList(3,List("a","b","v","v" , "dfg"))