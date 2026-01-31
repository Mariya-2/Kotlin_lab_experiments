fun main(args: Array<String>) {
    val a=arrayOf(6,null,3,0)
    for( i in a.indices){
        if(a[i]!=null) a[i]=a[i]!!-1
        else if(a[i]==null) a[i]=0
    }
    for(x in a) println(x)
}
