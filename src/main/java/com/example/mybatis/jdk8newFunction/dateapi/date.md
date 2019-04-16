1.8之前JDK自带的日期处理类非常不方便，我们处理的时候经常是使用的第三方工具包，比如commons-lang包等。
不过1.8出现之后这个改观了很多，比如日期时间的创建、比较、调整、格式化、时间间隔等。
这些类都在java.time包下。比原来实用了很多。

一、LocalDate/LocalTime/LocalDateTime
LocalDate为日期处理类、LocalTime为时间处理类、LocalDateTime为日期时间处理类，方法都类似，
具体可以看API文档或源码，选取几个代表性的方法做下介绍。
now相关的方法可以获取当前日期或时间，of方法可以创建对应的日期或时间，
parse方法可以解析日期或时间，get方法可以获取日期或时间信息，
with方法可以设置日期或时间信息，plus或minus方法可以增减日期或时间信息；

二、TemporalAdjusters
这个类在日期调整时非常有用，比如得到当月的第一天、最后一天，当年的第一天、最后一天，下一周或前一周的某天等。

三、DateTimeFormatter
以前日期格式化一般用SimpleDateFormat类，但是不怎么好用，现在1.8引入了DateTimeFormatter类，
默认定义了很多常量格式（ISO打头的），在使用的时候一般配合LocalDate/LocalTime/LocalDateTime使用，
比如想把当前日期格式化成yyyy-MM-dd hh:mm:ss的形式:

具体使用可以参考
https://blog.csdn.net/wyz0516071128/article/details/80834107