import java.io.File
fun main(args: Array<String>) {
    val path = "/home/shubham/basedir"
    val baseDir  = File(path)
    var counter = 0
    var name = ""
    baseDir.walkTopDown().forEach {
        if(it.isDirectory){
            val size = it.listFiles().size
            if(counter == 200){
                counter = 0
            }
            if(size > counter) {
                counter = size
                name = it.name
            }
        }
    }
    println(name +"  --  " +counter)
}
