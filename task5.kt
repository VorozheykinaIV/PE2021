fun main(args: Array<String>) {
   if (args.isEmpty()) println ("args is empty")
	else args.sort()
   val b = args.groupingBy { it }.eachCount()
  val d = b.toSortedMap(compareByDescending<String> { b[it] }.thenBy {it})
  d.forEach{println (it.key+' '+it.value)}
}