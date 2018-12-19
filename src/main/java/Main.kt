
import java.util.ArrayList

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //val dan = Player()
        val dan: Player = Player()// dan debe ir pegado a los dos puntos
        //val test = ""
        val chris = Person(edad=1,nombre="Sergio")// pasados sin el mismo orden y funciona!
        val chris3 = Person()
        val grez = Monster()
        //var x: Int=1// se que es tipo Integer
        //var y: Float=1f

        //val test=dan + chris


        dan.talkTo(chris) // prints "Hello."
        dan.talkTo(grez) // prints "Grrr!"
        //dan.talkTo(test);
        //val speakers = ArrayList<Speaker>()
        //kotlin recomienda utilizar listas en vez de arrays
        //List es como un array en kotlin , no puedes añadir ni borrar
        //MutableList es como la list aen java que puedes añadir yquitar cosas
        val speakers = listOf<Speaker>(chris,grez)
        val speakers2= mutableListOf<Speaker>()
        /*for(int i=0;i<speakers.size,i++){
            speakers.get(i).speak()
        } EL QEUIVALENTE EN KOTLIN BAJO */


        speakers.forEach{
            //it Speaker es como si hago referencia al de ahora, e scomo si en java hiciera
            // speakers[i]
            it.speak()// no hace falta saber el indice y se puede hacer
        }


        speakers.forEach{mySpeaker->
            mySpeaker.speak()//mySpeaker es el objeto
        }

        speakers.forEachIndexed { index, speaker ->//nos da el indice y el speaker
            if (index%2==0){

            }
            speakers[index].speak()
            speaker.speak()

        }



        speakers2.add(chris)
        speakers2.add(grez)
        val x=speakers.size
        val chris2 = speakers[0] as Person//encapsulacion de java con casteo
        chris2.test()
    }
}
