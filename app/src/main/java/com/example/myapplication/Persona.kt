package com.example.myapplication


open class Persona {

    var id =0
    var nombre=""

    var apellido=""

    var dni = 0
        get() = field
        set(value) {
            field = verificarDNI(value)
        }
    var direccion : Direccion

    constructor(
        id: Int,
        nombre: String,
        apellido: String,
        dni: Int,
        direccion: Direccion
    ) {
        this.id = id
        this.nombre = nombre
        this.apellido = apellido
        this.dni = dni
        this.direccion = direccion
    }

    open fun VerRol(){
        println("")
    }
    open fun VerDireccion(){
        println(direccion)
    }

    open fun CalcularPagos(Valorhora:Double,dias : Int,Presentismo:Double): Double {
        var a=0.0
        return a
    }

    open fun CalcularPagos(Valorhora:Double,HorasTrabajadas: Int):Double {
        var a=0.0
        return a
    }
    open fun CalcularPagos(Cuota:Double,Descuento: String):String {
        var a=""
        return a
    }

    override fun toString(): String {
        return "Persona(id=$id, nombre='$nombre', apellido='$apellido', direccion=$direccion, dni=$dni"
    }


    fun verificarDNI(dni:Int): Int {
        if (dni==30000000){
            println("Esta persona Posee Certificado Único de Discapacidad (CUD) ")
        }
        return dni
    }

}