import java.io.BufferedReader
import java.io.File

fun print( students: ArrayList<Student>) {
    for(i in 0..students.size - 1)
        println(students.get(i).surname + "\t" + students.get(i).name)
}

fun sortirovka(students: ArrayList<Student>){
    for(i in 0..students.size - 1){
        for(j in i + 1.. students.size - 1){
            if( students.get(i).surname.compareTo(students.get(j).surname) > 0 ){
                val tmp: Student = students[i]
                students[i] = students[j]
                students[j] = tmp
            }
        }
    }
}

fun main(){
    val students = ArrayList<Student>()
    val bufferedReader: BufferedReader = File("3.txt").bufferedReader()
    bufferedReader.forEachLine() {
        val tmpList = it.split(" ")
        val studenttmp = Student(tmpList.get(0), tmpList.get(1))
        students.add(studenttmp)
    }
    sortirovka(students)
    print(students)
}
