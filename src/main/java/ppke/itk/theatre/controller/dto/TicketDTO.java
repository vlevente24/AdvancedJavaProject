package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.Ticket;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private Integer id;
    private Integer seat;
    private PerformanceDTO performance;

    public static TicketDTO fromTicket(Ticket ticket) {
        return new TicketDTO(
                ticket.getId(),
                ticket.getSeat(),
                PerformanceDTO.fromPerformance(ticket.getPerformance())
        );
    }
}
