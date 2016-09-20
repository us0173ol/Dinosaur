package com.miked;

public class DinosaurSupervisor {

    public static void main(String[] args) {
	Dinosaur t_rex = new Dinosaur();
    Dinosaur velociraptor = new Dinosaur();
    Dinosaur diplodocus = new Dinosaur();


    t_rex.roar();
    velociraptor.roar();
    t_rex.kill();
    velociraptor.kill();
    }
}

