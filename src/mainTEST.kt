import kotlin.reflect.jvm.internal.ReflectProperties

//import java.util.*

fun  main() {

    fun afficherMenueArtcl() {

        println(" __________________________________________________  ")
        println( " _______ BIENVENUE DANS LE MENU ARTICLES _________")

        println("1. Sport")
        println("2. Politique")
        println("3. Art")
        println("4. Afrique")

    }

    fun afficherMenueVideos() {

        println(" __________________________________________________  ")
        println( " _______ BIENVENUE DANS LE MENU VIDEOS _________")

        println("1. #HORS SERIES ")
        println("2. LE DEBAT")
        println("3. #TRUSTVLOG")

    }

    fun afficherMenuePdcts() {

        println(" __________________________________________________  ")
        println( " _______ BIENVENUE DANS LE MENU PODCAST _________")

        println("1. #ADAMA ")
        println("2. LE DEBAT" )

    }

    fun afficherMenueInfo() {

        println(" __________________________________________________  ")
        println( " _______ BIENVENUE DANS LE MENUE INFORMATIQUE _________")

        println("1. JAVA")
        println("2. SQL")
        println("3. PHP")
        println("4. Python")

        println(" ")
        println("Entrez votre choix:")


    }
//    var scan = Scanner(System.`in`)  //est utilisé pour capturer ce que l'utilisateur tape sur le clavier dans la console.

    println ( " __________ TEST MINI PROJET KOTLIN _______________")
    println("  ")

    println("Entrez votre code : ")
//  var codeuser = scan.nextLine() //est l'équivalent d'un readLine()
    var codeuser = readLine() //J'ai préférée utiliser cela car je n'ai pas bien saisie l'utilité du scanner

    println( codeuser )
    //println( "200" )

    if ( codeuser == "200" ) {

        println(" __________________________________________________  ")
        println( " _______ BIENVENUE DANS LE MENU DE TRUSMAG _________")

        println("1. ARTICLES ")
        println("2. VIDEOS")
        println("3. PODCASTS")
        println("4. INFORMATIQUE")

        println(" ")
        println("Entrez celui de votre choix:")

        var ValMenue = readLine()
        
        println( ValMenue )
        //println("1")

        when ( ValMenue ) {

 // ici je fais appelle aux fonctions des différents menus afin que le code soit plus lisible.

            "1" -> {
                afficherMenueArtcl()
            }

            "2" -> {
                afficherMenueVideos()
            }

            "3" -> {
                afficherMenuePdcts()
            }

            "4" -> {
                afficherMenueInfo()
            }

        }

    }else {

        println(" Vous avez entré le code $codeuser , et ce code n'est pas bon ")
    }







}
