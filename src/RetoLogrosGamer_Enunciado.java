public class RetoLogrosGamer_Enunciado {
    public static void main(String[] args) {
        String juego = "LoL";
        int kills = 0;
        int muertes = 0;
        int asistencias = 0;
        int tiempoMin = 1; // minutos jugados
        int objetivos = 3;
        boolean desconexion = false;
        int danoH = 32000; // daño hecho
        int danoR = 9000;  // daño recibido
        int oro = 1500;

        // *************  RAGE QUIT para calculara una sola vez y guardarla *************
        boolean tuvoRq = (desconexion && tiempoMin < 5);

        // comprobamos el RAGE QUIT, con la variable guardada para evitar repetir el cálculo
        if (tuvoRq) {
            System.out.println("Logro NEGATIVO: Rage Quit 😠");
            return; // fin, no te llevas el logro PRO
        }

        // *************  KDA CÁLCULO == (kills+asistencias/muertes) *************
        double kda = (kills + asistencias) / (double) Math.max(1, muertes);
        System.out.println("KDA: " + kda);

        // PARTIDA AFK
        if (muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2) {
            System.out.println("Partida inválida: AFK");
            return;
        }

        // ************* Clasificación KDA *************
        if (kda > 5) {
            System.out.println("Jugador PRO");
        } else if (kda >= 3 && kda < 5) {
            System.out.println("Jugador BUENO");
        } else if (kda >= 1 && kda < 3) {
            System.out.println("Jugador NORMAL");
        } else if (kda < 1) {
            System.out.println("Jugador NOOB");
        }

        // ************** Logros básicos **************
        if (kills >= 10) {
            System.out.println("Logro: Cazador experto 🏹");
        }

        if (muertes == 0 && kills >= 5) {
            System.out.println("Logro: Intocable 👑");
        }

        if (tiempoMin > 60) {
            System.out.println("Logro: Maratón gamer ⏱️");
        }

        if (danoH > danoR * 2) {
            System.out.println("Logro: Dominio total 💥");
        }

        if (objetivos >= 3) {
            System.out.println("Logro: Objetivos de mapa 🎯");
        }

        // ******** Logros para Fortnite, LoL, Minecraft, Pokemon ********
        if (juego.equals("Fortnite")) {
            if (kills >= 15 && muertes <= 2) {
                System.out.println("Victoria agresiva (Fortnite) 🔫");
            }
            if (oro >= 2000) {
                System.out.println("Ahorrista de V-Bucks (Fortnite) 💰");
            }
            if ((kills + asistencias) >= 25) {
                System.out.println("Impacto masivo 🌪️");
            }
        } else if (juego.equals("LoL")) {
            if (objetivos >= 2 && asistencias >= 10) {
                System.out.println("Shotcaller (LoL) 🗣️");
            }
            if (danoH >= 30000 && muertes <= 3) {
                System.out.println("Carry principal (LoL) 🛡️");
            }
            if ((kills + asistencias) >= 25) {
                System.out.println("Impacto masivo 🌪️");
            }
        } else if (juego.equals("Minecraft")) {
            if (tiempoMin >= 45 && danoR == 0) {
                System.out.println("Superviviente pacífico (MC) 🌿");
            }
            if (objetivos >= 5) {
                System.out.println("Constructor incansable (MC) 🧱");
            }
        } else if (juego.equals("Pokemon")) {
            if (kills >= 6 && danoR <= 1000) {
                System.out.println("Entrenador maestro (PKMN) 🧢");
            }
            if (asistencias >= 3) {
                System.out.println("Apoyo del equipo (PKMN) 🤝");
            }
        }

        // ******** Uso de la variable tuvoRq más adelante ********
        if (tuvoRq) {
            System.out.println("⚠️ Este jugador abandonó la partida temprano.");
        }
    }
}
