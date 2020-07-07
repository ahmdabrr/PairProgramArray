import java.util.*

class Orang {
    var manusia = arrayOf("Abrar", "Andi", "Alfi", "Nanda", "Andri", "Wisnu", "Johan", "Hanif", "Andra", "Sheno")
    fun arrayBiasa(){
        println("Implementasi Array")
        for (i in manusia){
            println(i)
        }
    }

    fun linkedList(){
        println("Implementasi LinkedList")
        val ll = LinkedList<String>()
        for (i in manusia){
            ll.add(i)
        }
        for (i in ll){
            println(i)
        }
    }

    fun arrayList() {
        println("Implementasi ArrayList")
        val al = ArrayList<String>()
        for (i in manusia) {
            al.add(i)
        }
        for (i in al){
            println(i)
        }
    }

    fun listArrayList(){
        println("Implemetasi List dengan Instansiasi ArrayList")
        var array1:List<String> = arrayListOf("Abrar", "Andi", "Alfi", "Nanda", "Andri", "Wisnu", "Johan", "Hanif", "Andra", "Sheno")
        for (e in array1) {
            println(e)
        }
    }
}