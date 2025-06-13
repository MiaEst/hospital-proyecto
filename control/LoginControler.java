package control;

public class LoginControler {
    String[][]  datos = {
    {"mrojas", "delta321"},
    {"lhernandez", "clave2025"},
    {"fcarrillo", "sunrise!"},
    {"kvasquez", "orange77"},
    {"epineda", "trustme1"},
    {"zmedina", "omega@123"},
    {"bescobar", "shadow45"},
    {"jaguilar", "secure99"},
    {"ynavarro", "moonlight"},
    {"dcruz", "access2025"},
    {"irodriguez", "power#1"}
    };
    

    public boolean validacionDatos(String entradaUsuario, String entradaContra) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][0].equals(entradaUsuario) && datos[i][1].equals(entradaContra)) {
                return true; // Coincidencia encontrada, acceso permitido
            }
        }
        return false; // No se encontró ninguna coincidencia
    }
}
