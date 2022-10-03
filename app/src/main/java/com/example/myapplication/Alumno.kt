package com.example.myapplication

    class Alumno : Persona

 {
    var Cuota=0.0
    var curso: Curso

     constructor(
         id: Int,
         nombre: String,
         apellido: String,
         dni: Int,
         direccion: Direccion,
         pago: Double,
         curso: Curso
     ) : super(id, nombre, apellido, dni, direccion) {
         this.Cuota = pago
         this.curso = curso
     }

     override fun VerRol(){
         println("Esta Persona es un Alumno")
     }
     override fun VerDireccion(){
         println(direccion)
     }

     override fun CalcularPagos(Valorcusro:Double, descuentoEspecial:String): String {
         if (descuentoEspecial=="Becado"){
             this.Cuota=Valorcusro-(Valorcusro*20/100)
             return "Esta Persona esta Becada Recibira un descuento del 20% y su Costo Total sera ${this.Cuota}$"
         }
         else{this.Cuota= Valorcusro
         return "Esta Persona Pagara La Tarifa normal de ${Cuota}"}
     }

     override fun toString(): String {
         return "Alumno Nombre: '$nombre', Apellido: '$apellido',ID: $id, DNI: $dni Cuota :$Cuota$ $curso)"
     }



 }