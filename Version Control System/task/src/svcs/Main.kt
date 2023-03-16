package svcs

fun main(args: Array<String>) {
    when(val command: String? = if (args.isNotEmpty()) args[0] else null){
        null -> {
            println("These are SVCS commands:\n" +
                    "config     Get and set a username.\n" +
                    "add        Add a file to the index.\n" +
                    "log        Show commit logs.\n" +
                    "commit     Save changes.\n" +
                    "checkout   Restore a file.")
        }
        "--help" -> {
            println("These are SVCS commands:\n" +
                    "config     Get and set a username.\n" +
                    "add        Add a file to the index.\n" +
                    "log        Show commit logs.\n" +
                    "commit     Save changes.\n" +
                    "checkout   Restore a file.")
        }
        "config" -> {
            println("Get and set a username.")
        }
        "add" ->{
            println("Add a file to the index.")
        }
        "log" -> {
            println("Show commit logs.")
        }
        "commit" -> {
            println("Save changes.")
        }
        "checkout" -> {
            println("Restore a file.")
        }
        else -> {
            println("'$command' is not a SVCS command.")
        }
    }
}