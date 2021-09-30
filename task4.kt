fun main(args: Array<String>) {
   args.sort()
   val b = args.groupingBy { it }.eachCount()
   val c = args.distinct()
   c.forEach{println(it+' '+b.get(it))}
}