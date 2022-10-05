package com.example.myapplication

fun main(){

    println("**************************************************")
   var empleado1 =Empleado(1,"Pedro","Perez",12345678,Direccion("P.larre",333),"Profesor",0.0)

    empleado1.CalcularPagos(1000.0,50)
    println(empleado1)
    empleado1.VerRol()
    empleado1.VerDireccion()

    println("**************************************************\n")

    var empleado2 =Empleado(1,"Jose","Diaz",55699887,Direccion("AV.lima",333),"Administrativo",0.0)

    empleado2.CalcularPagos(1000.0,50,1200.0)
    println(empleado2)
    empleado2.VerRol()
    empleado2.VerDireccion()

    println("**************************************************\n")

    var alumno1 =Alumno(1,"Alan","Gonzalez",30000000, Direccion("Aguilar",600),0.0,
        Curso("Programacion",1)
    )
    println(alumno1.CalcularPagos(3000.0,"Becad0"))
    println(alumno1)
    alumno1.VerRol()
    alumno1.VerDireccion()


}