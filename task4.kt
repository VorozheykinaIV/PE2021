fun main(args: Array<String>) {
   if (args.isEmpty()) println ("args is empty")
	else args.sort()
   val b = args.groupingBy { it }.eachCount()
   val c = args.distinct()
   c.forEach{println(it+' '+b.get(it))}
}