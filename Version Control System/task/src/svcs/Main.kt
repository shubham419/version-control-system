package svcs
import java.io.File

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
            if(args.indices.contains(1)){
                println("The username is ${args[1]}.")
                saveUser(args[1])
            }else{
                if(File("vcs/config.txt").exists()){
                    val name = File("vcs/config.txt").readText()
                    println("The username is $name.")
                }else{
                    println("Please, tell me who you are.")
                }
            }
        }
        "add" ->{
            if(args.indices.contains(1)){
                if(File(args[1]).isFile) {
                    println("The file '${args[1]}' is tracked.")
                    saveFile(args[1])
                }
                else{
                    println("Can't find '${args[1]}'.")
                }
            }else {
                if (File("vcs/index.txt").exists()) {
                    val  file = File("vcs/index.txt").readText()
                    println("Tracked files:")
                    println(file)
                } else {
                    println("Add a file to the index.")
                }
            }
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

fun saveFile(fileName: String) {
    val dir = File("vcs")
    if(!dir.isDirectory){
        File("vcs").mkdir()
    }
    val path = "vcs/index.txt"
    val file = File(path)
    file.appendText(fileName + "\n")
}

fun saveUser(name: String) {
    val dir = File("vcs")
    if(!dir.isDirectory){
        File("vcs").mkdir()
    }
    val path = "vcs/config.txt"
    val file = File(path)
    file.writeText(name)
}
