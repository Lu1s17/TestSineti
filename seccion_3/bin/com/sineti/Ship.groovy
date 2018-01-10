package com.sineti

class Ship {

	String nombre
	Integer capacidad
	String nacionalidad
	

    static constraints = {
    nacionalidad nullable : false
    }
}
