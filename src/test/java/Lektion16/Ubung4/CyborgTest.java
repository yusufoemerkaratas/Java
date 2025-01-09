package Lektion16.Ubung4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyborgTest {
        @Test
        void testMenschEntscheidungen() {
            Mensch mensch = new Mensch();

            // GEFAHR_LINKS: Sağa kaçar
            assertEquals(Entscheidung.rechts, mensch.entscheide(Gefahr.gefahr_links));

            // GEFAHR_RECHTS: Sola kaçar
            assertEquals(Entscheidung.links, mensch.entscheide(Gefahr.gefahr_rechts));

            // GEFAHR_VORNE: Fren yapar
            assertEquals(Entscheidung.bremen, mensch.entscheide(Gefahr.gefahr_vor));

            // %25 oranında kararsızlık (statik test edilemez ama birkaç kez çalıştırılabilir)
        }

        @Test
        void testRobotEntscheidungen() {
            Roboter robot = new Roboter();

            // GEFAHR_LINKS: Sağa kaçar
            assertEquals(Entscheidung.rechts, robot.entscheide(Gefahr.gefahr_links));

            // GEFAHR_RECHTS: Sola kaçar
            assertEquals(Entscheidung.links, robot.entscheide(Gefahr.gefahr_rechts));

            // GEFAHR_VORNE: Fren yapar
            assertEquals(Entscheidung.bremen, robot.entscheide(Gefahr.gefahr_vor));
        }

        @Test
        void testCyborgEntscheidungen() {
            Mensch mensch = new Mensch();
            Roboter robot = new Roboter();
            Cyborg cyborg = new Cyborg(mensch, robot);

            // Mensch ve Robot aynı karar alırsa, bu karar Cyborg tarafından uygulanmalı
            assertEquals(Entscheidung.rechts, cyborg.entscheide(Gefahr.gefahr_links)); // İkisi de RECHTS

            // Mensch ve Robot farklı karar alırsa, Cyborg rastgele bir karar almalı
            // Rastgelelik nedeniyle, bu test birkaç kez çalıştırılabilir ve doğruluk manuel olarak gözlemlenebilir.
        }

        @Test
        void testCyborgBehaviors() {
            Mensch mensch = new Mensch();
            Roboter robot = new Roboter();
            Cyborg cyborg = new Cyborg(mensch, robot);

            // Cyborg'un Mensch davranışlarını test et
            cyborg.essen(); // İnsan gibi yemek yer
          // İnsan gibi uyur

            // Cyborg'un Robot davranışlarını test et
            cyborg.aufladen(); // Robot gibi şarj olur
            cyborg.arbeiten(); // İnsan ve robot gibi çalışır
        }
    }

