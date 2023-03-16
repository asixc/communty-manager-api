package dev.jotxee.security.comunity.controller;

import dev.jotxee.security.comunity.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/community-manager")
public class ManagerController {

    //private final UserRepository repository;

    private UserService userService;

    @GetMapping("/receipts")
    public ResponseEntity getReceipts(){
        // cada usuario esta asociado a una vivienda
        // 1 Buscamos la vivienda asociada al usuario
        // 2 devolvemos l
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PutMapping("/users/{id}/associate/{floor}") // EJEMPLO: PUT /users/123/associate/456 HTTP/1.1
    public ResponseEntity associateUserToFloor(@PathVariable final Integer id, @PathVariable final Long floor){
         if(userService.getUserById(id) != null); // Si el usuario existe comprobamos si algún usuario tiene ese piso asociado
            log.info("User found");
        return ResponseEntity.ok(new ArrayList<>());
    }
    /*
    public ResponseEntity<?> updateUserFloor(@PathVariable Long id, @RequestBody User user) {
        // Verificamos si el usuario existe
        if (userService.getUserById(id) == null) {
            return ResponseEntity.notFound().build();
        }

        // Actualizamos el ID del piso del usuario
        userService.updateUserFloor(id, user.getFloorId());

        return ResponseEntity.ok().build();
    }
     */


    /*
En este ejemplo, la entidad Piso tiene una relación @OneToMany con la entidad Pago, lo que significa que un piso puede tener muchos pagos. La propiedad mappedBy en la anotación @OneToMany indica que la propiedad piso en la entidad Pago mapea a esta relación.

La entidad Pago tiene una relación @ManyToOne con la entidad Usuario, lo que significa que un pago tiene un usuario que lo realizó. También tiene una relación @ManyToOne con la entidad Piso, lo que significa que un pago está asociado a un piso.

Finalmente, la entidad Usuario tiene una relación @OneToMany con la entidad Pago, lo que significa que un usuario puede tener muchos pagos.

Para agregar un pago a un piso, puedes utilizar el método addPago en la entidad Piso, como se muestra a continuación:

Piso piso = // Obtener el piso de alguna forma
Usuario usuario = // Obtener el usuario de alguna forma
YearMonth fecha = YearMonth.now();
double cantidad = 100.0;

Pago pago = new Pago();
pago.setUsuario(usuario);
pago.setFecha(fecha);
pago.setCantidad(cantidad);

piso.addPago(pago);

// Guardar el piso y el pago en la base de datos con JPA

     */
}
