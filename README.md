# taftet的client端
- 主要接口在TafTest（Controller）的invoke接口，入参为ip和port
- 由于client端简单调用即可，没有嵌入taf定制化springboot，定制化springboot局限太多，在加载sprigboot时候默认有config文件检测勾子
- 远程调试命令：java -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000 ./taftest.jar
  - suspend = n表示不挂起