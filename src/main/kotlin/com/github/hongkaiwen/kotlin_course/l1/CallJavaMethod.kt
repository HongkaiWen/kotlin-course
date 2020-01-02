package com.github.hongkaiwen.kotlin_course.l1

fun main() {
  //kotlin 声明变量时可以直接使用var或val， var表示变量，val表示不可变量
  //创建对象不需要new关键字
  //每一行都不需要分号
  var s = Student()
  //可以直接通过 .属性 来取值或赋值
  s.name = "zhangsan"
  s.age = 12
  println(s)
}
