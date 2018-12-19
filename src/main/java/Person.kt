class Person(val nombre: String="",val edad: Int=0) : Speaker {// si solo tiene un cosntructor se pone arriba con (edad: Int)
    // ahi hay que poner espacio :
    //val es para poderlo utilizar en toda nuestra clase si no solo sirve pa ralos constructores o solo para inicializar
    //asi val se puede utilziar en speak
    //si no habria que hacer:
                            /*val nombre: String
                            init {
                                this.nombre=nombre
                            }
                            */
    //si n opaso ningun atributo coge 0 por defecto

    // nombre inicializado a vacio

    // val es como decir val edad=this.edad
    //val direccion: String// no puede ser null

    init {
        edad.plus(2)
    }

    val direccion: String?=null//asi puede ser null, con ? puede sertodo nulo


    override fun speak() = println("Hola $nombre $edad")    // con = ahorramos corchetes

    fun test() {
        println("test")

    }

    //al poner 2 pers a sumar es devovler la suma de las 2 edades
    //cada vez qwue haga plus hará lo de abajo
    /*
    operator fun plus (other:Person): Int{
        return other.edad+this.edad
    }*/

    // mas sencillo convencion
    operator fun plus (other:Person): Int=  other.edad+this.edad


}
