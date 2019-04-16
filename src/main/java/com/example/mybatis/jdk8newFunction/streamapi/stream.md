首先对stream的操作可以分为两类，中间操作(intermediate operations)和结束操作(terminal operations):

中间操作总是会惰式执行，调用中间操作只会生成一个标记了该操作的新stream。
结束操作会触发实际计算，计算发生时会把所有中间操作积攒的操作以pipeline的方式执行，这样可以减少迭代次数。计算完成之后stream就会失效。
虽然大部分情况下stream是容器调用Collection.stream()方法得到的，但stream和collections有以下不同：

无存储。stream不是一种数据结构，它只是某种数据源的一个视图，数据源可以是一个数组，Java容器或I/O channel等。
为函数式编程而生。对stream的任何修改都不会修改背后的数据源，比如对stream执行过滤操作并不会删除被过滤的元素，而是会产生一个不包含被过滤元素的新stream。
惰式执行。stream上的操作并不会立即执行，只有等到用户真正需要结果的时候才会执行。
可消费性。stream只能被“消费”一次，一旦遍历过就会失效，就像容器的迭代器那样，想要再次遍历必须重新生成。

在使用时通常分为以下几个
1、forEach() 使用该方法迭代流中的每个数据
2、sorted() 使用该方法排序数据
3、1filter()：使用该方法过滤
4、limit()：使用该方法截断
5、skip()：与limit互斥，使用该方法跳过元素
6、distinct()：使用该方法去重，注意：必须重写对应泛型的hashCode()和equals()方法
7、max，min，sum，avg，count  
8、map()：接收一个方法作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
9、flatMap()：对每个元素执行mapper指定的操作，并用所有mapper返回的Stream中的元素组成一个新的Stream作为最终返回结果，通俗易懂就是将原来的stream中的所有元素都展开组成一个新的stream
10、findFirst() ：使用该方法获取第一个元素
