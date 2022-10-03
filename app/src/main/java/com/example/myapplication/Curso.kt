package com.example.myapplication

  class Curso {

    var nombrecurso=""
    var anio=0

    constructor(nombrecurso: String, anio: Int) {
        this.nombrecurso = nombrecurso
        this.anio = anio
    }


    override fun toString(): String {
        return "\nNombre del Curso:'$nombrecurso', Año :$anio°)"
    }
}