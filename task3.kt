fun main(args: Array<String>) {
   args.sort()
   val b = args.distinct()
   b.forEach { println(it) }
}