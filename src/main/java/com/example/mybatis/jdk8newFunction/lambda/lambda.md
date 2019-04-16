lambda小结
一、lambda的声明和使用
函数式编程  eg：排序类的方法传入
二、函数式接口 FunctionalInterface
限制：有且仅有一个非Object类的public方法
lambda的高阶函数  等等  包括函数到函数的映射 eg：  x -> y-> x*y
详情参考：https://blog.csdn.net/lz710117239/article/details/76192629
三、构造和方法引用
通过lambda引用其他方法包括构造
四、作用域
在lambda表达式中访问外层作用域和老版本的匿名对象中的方式很相似。
可以直接访问标记了final的外层局部变量，或者实例的字段以及静态变量。

外侧局部变量可以不为 final 修饰 但是必须满足final语义（不被修改）否则编译报错