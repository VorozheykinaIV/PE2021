fun main(args: Array<String>) {
	if (args.isEmpty()) println ("args is empty")
	else 
	   args.sort()
	   args.forEach { println(it) }
}