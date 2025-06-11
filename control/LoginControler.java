package control;

public class LoginControler {
    String[][] usuariosYContraseñas = {
        {"alejos", "hola1234"},       // Dato original
        {"maria22", "claveMaria"},    // +10 nuevos pares
        {"juanP", "juanito456"},
        {"ana_light", "anaSystem"},
        {"superUser", "admin2024"},
        {"coderPro", "javaIsFun"},
        {"dragonZ", "firePassword"},
        {"luna99", "moonLight"},
        {"traveler", "viajes2023"},
        {"bookLover", "readMore12"},
        {"gamerX", "playStation5"}
    };

    public boolean validacionDatos(String entradaCorreo, String entraContrasenna) {

        for (int i = 0; i < usuariosYContraseñas.length; i++) {
            String usuarioCorrecto = usuariosYContraseñas[i][0];
            String contraseñaCorrecta = usuariosYContraseñas[i][1];
            
         
            if (usuarioCorrecto.equals(entradaCorreo) && 
                contraseñaCorrecta.equals(entraContrasenna)) {
                return true; 
            }
        }
        return false;
    }
}
