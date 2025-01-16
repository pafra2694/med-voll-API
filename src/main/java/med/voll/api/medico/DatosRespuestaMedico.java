package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;
import med.voll.api.direccion.Direccion;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        DatosDireccion datosDireccion
) {

    public DatosRespuestaMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEmail(),medico.getTelefono(), medico.getDocumento(), new DatosDireccion(medico.getDireccion()));
    }
}
