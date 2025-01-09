package Lektion16.Ubung4;

import java.util.Random;

public class Cyborg {
    private Mensch mensch;
    private Roboter roboter;
    private Random random;

    public Cyborg(Mensch mensch,Roboter roboter){
        this.mensch=mensch;
        this.roboter=roboter;
        this.random=new Random();
    }
    public Entscheidung entscheide(Gefahr gefahr) {
        Entscheidung menschEntscheidung = mensch.entscheide(gefahr);
        Entscheidung roboterEntscheidung = roboter.entscheide(gefahr);

        if (menschEntscheidung == roboterEntscheidung) {
            return menschEntscheidung;
        } else {
            return random.nextBoolean() ? menschEntscheidung : roboterEntscheidung;
        }
    }
        public void essen() {
           this.mensch.essen();
        }

        public void aufladen() {
           this.roboter.aufladen();
        }

        public void arbeiten() {
          this.mensch.arbeiten();
          this.roboter.arbeiten();
        }

        public void autofahren(){
         this.mensch.autofahren();
           this.roboter.autofahren();
        }
    }


