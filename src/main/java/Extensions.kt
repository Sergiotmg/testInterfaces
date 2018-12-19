//fun String.countCharacter(stringRead: String, char: Char): Int{// con 2 puntos es que nos devuelve Int

fun String.countCharacter(char: Char): Int{// con 2 puntos es que nos devuelve Int
    var count=0 //val seria constante
    //stringRead.toLowerCase().forEach{
    this.toLowerCase().forEach {// ahora es rhis porque es de sí mismo
        if (it==char.toLowerCase()){
            count++
        }
    }
    return count
}

fun test(){
    println("Hello from test method")
}

// en kotlin se permite no generar una clas esino un archivo y llamarlo