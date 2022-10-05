package com.example.myapplication

class Empleado : Persona {

    var cargo=""
    var sueldo=0.0

    constructor(
        id: Int,
        nombre: String,
        apellido: String,
        dni: Int,
        direccion: Direccion,
        cargo: String,
        sueldo: Double
    ) : super(id, nombre, apellido, dni, direccion) {
        this.cargo = cargo
        this.sueldo = sueldo
    }


    override fun VerRol(){
        println("Esta Persona es un ${cargo}")
    }
    override fun VerDireccion(){
        println(direccion)
    }

    override fun CalcularPagos(Valorhora:Double, HorasTrabajadas: Int):Double {
        this.sueldo=Valorhora*HorasTrabajadas.toDouble()
        return sueldo
    }

    override fun CalcularPagos(Valorhora:Double,dias : Int,Presentismo:Double):Double {
        this.sueldo=Valorhora*dias+Presentismo
        println("Sueldo establecido")
        return sueldo
    }

    override fun toString(): String {
        return "Empleado ID: $id, Nombre: '$nombre', Apellido: '$apellido', DNI: $dni Cargo: '$cargo', Sueldo: $sueldo$"
    }


}
