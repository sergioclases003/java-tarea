public class RetoLogrosGamer_Enunciado {
    public static void main(String[] args) {
        String juego = "LoL";
        int kills = 0;
        int muertes = 0;
        int asistencias = 0;
        int tiempoMin = 1; //minutos jugados
        int objetivos = 3;
        boolean desconexion = false;
        int dañoH = 32000; // daño hecho
        int dañoR = 9000; // daño recibido
        int oro = 1500;

        // *************  RAGE QUIT *************

        if (desconexion && tiempoMin < 5) {
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
            System.out.println("Logro: Intocable \uD83D\uDC51");
        }

        if (tiempoMin > 60) {
            System.out.println("Logro: Maratón gamer ⏱️");
        }

        if (dañoH > dañoR * 2) {
            System.out.println("Logro: Dominio total 💥");
        }

        if (objetivos >= 3) {
            System.out.println("Logro: Objetivos de mapa 🎯");
        }

        // ******** Logros para Fortnite, LOL, Minecraft, Pokemon ********
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
                System.out.println("Shotcaller (LoL) \uD83D\uDDE3\uFE0F");
            }
            if (dañoH >= 30000 && muertes <= 3) {
                System.out.println("Carry principal (LoL) 🛡️");
            }
            if ((kills + asistencias) >= 25) {
                System.out.println("Impacto masivo 🌪️");
            }
        } else if (juego.equals("Minecraft")) {
            if (tiempoMin >= 45 && dañoR == 0) {
                System.out.println("Superviviente pacífico (MC) \uD83C\uDF3F");
            }
            if (objetivos >= 5) {
                System.out.println("Constructor incansable (MC) \uD83E\uDDF1");
            }
        } else if (juego.equals("Pokemon")) {
            if (kills >= 6 && dañoR <= 1000) {
                System.out.println("Entrenador maestro (PKMN) 🧢");
            }
            if (asistencias >= 3) {
                System.out.println("Apoyo del equipo (PKMN) 🤝");
            }
        }
    }
}
