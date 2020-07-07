import java.util.*
import kotlin.collections.ArrayList


fun main () {

    //array
//    var arrayBiasa = arrayOf("Abrar", "Andi", "Alfi")
//        for (i in arrayBiasa){
//            println(i)
//        }
//
//    //LinkedList
//    val ll = LinkedList<String>()
//    for (i in arrayBiasa){
//        ll.add(i)
//    }
//    for (i in ll){
//        println(i)
//    }
//
//    //ArrayList
//    val al = ArrayList<String>()
//    for (i in arrayBiasa) {
//        al.add(i)
//    }
//    for (i in al){
//        println(i)
//    }
//
//    //List dengan ArrayList
//
//    var array1:List<String> = arrayListOf("Andi", "Alfi", "Abrar")
//    for (e in array1){
//        println(e)
//    }
    do {
        print("""
            ------------- Silahkan Pilih ------------------
            1. Implementasi Array
            2. Implementasi LinkedList
            3. Implementasi ArrayList
            4. Implementasi List dan Instansiasi ArrayList
            5. Keluar
            Masukkkan Pilihan : 
        """.trimIndent())
        var num = readLine()!!

        when(num){
            "1" -> {Orang().arrayBiasa()}
            "2" -> {Orang().linkedList()}
            "3" -> {Orang().arrayList()}
            "4" -> {Orang().listArrayList()}
        }
    }while (num != "5")
}


