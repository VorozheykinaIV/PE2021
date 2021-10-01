fun main(args: Array<String>) {
if (args.isEmpty()) println ("args is empty")
	else 
   args.sort()
   val b = args.distinct()
   b.forEach { println(it) }
}