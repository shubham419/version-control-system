import java.io.File
fun main(args: Array<String>) {
    val path = "/home/shubham/test.txt"
    val file = File(path)
    file.appendBytes(byteArrayOf(1,122, 2, 5))
    
//    var counter = 0
//    if(file.exists()){
//        val list = file.readLines()
//        for (line in list){
//            if(line.toIntOrNull() != null){
//                counter ++
//            }
//        }
//    }
//    println(counter)
}
