package section2.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException(e.message)
    }
}

fun parseIntOrNull_v1(str: String): Int? {
    try{
        return str.toInt()
    } catch(e: NumberFormatException){
        return null
    }
}

/**
 * 하나의 Expression 으로 간주
 * */
fun parseIntOrNull_v2(str: String): Int? {
    return try{
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

/**
 * 코틀린은 모든 예외를 Unchecked Exception 임
 * -> 강제로 Exception 예외 체크를 안해도 됌
 * */
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

/**
 * try with resources 구문
 * */
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
}