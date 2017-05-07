1.使用maven引入spring 的jar包
2.使用maven引入spring aop的所依赖的jar包
	注意：spring aop的实现除spring framework带的aop包外还需要aspectj的支持包(详见：http://blog.csdn.net/bigtree_3721/article/details/50759843)
	包括l:aspectjrt.jar,aspectjweaver.jar,aspectjtools.jar等包
3.applicationContext.xml的aop名称空间的引入