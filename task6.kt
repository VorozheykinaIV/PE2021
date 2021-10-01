fun main(args: Array<String>) 
{
    if (args.isEmpty()) {
        val ins = readLine()!!.split(" ") 
        val b = ins.groupingBy { it }.eachCount()
      val d = b.toSortedMap(compareByDescending<String> { b[it] }.thenBy {it})
      d.forEach{println (it.key+' '+it.value)}
    }
    else { 
       val ab = args.groupingBy { it }.eachCount()
      val ad = ab.toSortedMap(compareByDescending<String> { ab[it] }.thenBy {it})
      ad.forEach{println (it.key+' '+it.value)}
    }
    
}