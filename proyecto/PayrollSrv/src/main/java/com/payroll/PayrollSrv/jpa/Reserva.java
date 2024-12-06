package com.payroll.PayrollSrv.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer idReserva;
    private String aula; // Sala donde se realiza la reserva
    private String fecha; // Fecha en formato "dd/MM/yyyy"
    private String horario; // Horario en formato "hh:mm"
}

