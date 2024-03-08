package com.someecho.sojava.core.annotation.retention;

/**
 * 通过执行 javap -verbose RetentionTest命令获取到的RetentionTest 的 class 字节码内容如下
 */
public class RetentionTest {
 
	@SourcePolicy
	public void sourcePolicy() {
	}
 
	@ClassPolicy
	public void classPolicy() {
	}
 
	@RuntimePolicy
	public void runtimePolicy() {
	}
//
//	警告: 文件 ./RetentionTest.class 不包含类 RetentionTest
//	Last modified 2024年3月8日; size 616 bytes
//	SHA-256 checksum 1d3637d1f6b94a21e7b4174df5e015f3cf1843c5c52335aad235e83f8be43e63
//	Compiled from "RetentionTest.java"
//	public class com.someecho.sojava.core.annotation.retention.RetentionTest
//	minor version: 0
//	major version: 65
//	flags: (0x0021) ACC_PUBLIC, ACC_SUPER
//	this_class: #7                          // com/someecho/sojava/core/annotation/retention/RetentionTest
//	super_class: #2                         // java/lang/Object
//	interfaces: 0, fields: 0, methods: 4, attributes: 1
//	Constant pool:
//			#1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
//			#2 = Class              #4             // java/lang/Object
//			#3 = NameAndType        #5:#6          // "<init>":()V
//			#4 = Utf8               java/lang/Object
//   #5 = Utf8               <init>
//   #6 = Utf8               ()V
//   #7 = Class              #8             // com/someecho/sojava/core/annotation/retention/RetentionTest
//			#8 = Utf8               com/someecho/sojava/core/annotation/retention/RetentionTest
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               sourcePolicy
//  #12 = Utf8               classPolicy
//  #13 = Utf8               RuntimeInvisibleAnnotations
//  #14 = Utf8               Lcom/someecho/sojava/core/annotation/retention/ClassPolicy;
//  #15 = Utf8               runtimePolicy
//  #16 = Utf8               RuntimeVisibleAnnotations
//  #17 = Utf8               Lcom/someecho/sojava/core/annotation/retention/RuntimePolicy;
//  #18 = Utf8               SourceFile
//  #19 = Utf8               RetentionTest.java
//	{
//  public com.someecho.sojava.core.annotation.retention.RetentionTest();
//		descriptor: ()V
//		flags: (0x0001) ACC_PUBLIC
//		Code:
//		stack=1, locals=1, args_size=1
//		0: aload_0
//		1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//		4: return
//			LineNumberTable:
//		line 6: 0
//
//		public void sourcePolicy();
//		descriptor: ()V
//		flags: (0x0001) ACC_PUBLIC
//		Code:
//		stack=0, locals=1, args_size=1
//		0: return
//			LineNumberTable:
//		line 10: 0
//
//		public void classPolicy();
//		descriptor: ()V
//		flags: (0x0001) ACC_PUBLIC
//		Code:
//		stack=0, locals=1, args_size=1
//		0: return
//			LineNumberTable:
//		line 14: 0
//		RuntimeInvisibleAnnotations:  //记录注解信息：运行期不可见
//		0: #14()
//		com.someecho.sojava.core.annotation.retention.ClassPolicy
//
//		public void runtimePolicy();
//		descriptor: ()V
//		flags: (0x0001) ACC_PUBLIC
//		Code:
//		stack=0, locals=1, args_size=1
//		0: return
//			LineNumberTable:
//		line 18: 0
//		RuntimeVisibleAnnotations:  //运行期可见
//		0: #17()
//		com.someecho.sojava.core.annotation.retention.RuntimePolicy
//	}
//	SourceFile: "RetentionTest.java"

}