# java -classpath /Users/shailendrakumar/Documents/intellij/JavaGenericsAndCollection/out/production/JavaGenericsAndCollection com.helix.compiler.PerformanceEx1.Main 10

# java -XX:+PrintCompilation -classpath /Users/shailendrakumar/Documents/intellij/JavaGenericsAndCollection/out/production/JavaGenericsAndCollection com.helix.compiler.PerformanceEx1.Main 10

The command will return an output containing columns. The First Column is the time for which the JVM has started running in ms. Second column is order of execution. Third column
might have n , !, s, % indicating java native, Expection Handling, synchronized code and code in code cache. The fourth column indicates the code compilation level 0 to 4
0 meaning basic interpretation, 4 is highest code optimized compilation.

 And the last column is the actual java library or method compiled.

    338    1       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
    338    2       3       jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
    341    3       3       java.lang.Object::<init> (1 bytes)
    341    4       3       java.lang.StringLatin1::hashCode (42 bytes)
    362   39   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
    363   42     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)
    363   43     n 0       jdk.internal.misc.Unsafe::compareAndSetObject (native)
    365   40       3       java.util.concurrent.ConcurrentHashMap::addCount (289 bytes)
    372   54       3       java.util.HashMap::newNode (13 bytes)
    373   61     n 0       java.lang.Object::hashCode (native)
    373   55       3       java.util.HashMap::afterNodeInsertion (1 bytes)
    374   63       3       java.util.ImmutableCollections$Set12::iterator (9 bytes)
    375   64     n 0       java.lang.System::arraycopy (native)   (static)
    375   65       3       java.lang.Math::min (11 bytes)
    376   66       3       java.util.Map::entry (10 bytes)
    377   67       4       java.lang.String::hashCode (49 bytes)
    465   86       3       java.lang.Integer::valueOf (32 bytes)
    465   90 %     4       com.helix.compiler.PerformanceEx1.PrimeNumbers::isPrime @ 2 (35 bytes)
    471   93       3       com.helix.compiler.PerformanceEx1.PrimeNumbers::getNextPrimeAbove (43 bytes)
    473   92       3       java.util.ArrayList::add (23 bytes)
   1238  119       4       java.lang.AbstractStringBuilder::append (77 bytes)


 #StringPool

 $ java -XX:+PrintStringTableStatistics -classpath /Users/shailendrakumar/Documents/intellij/JavaGenericsAndCollection/out/production/JavaGenericsAndCollection com.helix.compiler.StringPool.ExploringStrings
 Hello
 SymbolTable statistics:
 Number of buckets       :     20011 =    160088 bytes, each 8
 Number of entries       :     17219 =    413256 bytes, each 24
 Number of literals      :     17219 =    631640 bytes, avg  36.683
 Total footprint         :           =   1204984 bytes
 Average bucket size     :     0.860
 Variance of bucket size :     0.862
 Std. dev. of bucket size:     0.929
 Maximum bucket size     :         9
