package com.msticket.ms_ticket_manager.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.msticket.ms_ticket_manager.entities.dto.TicketResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class EventResponse {
    @JsonProperty("id") 
    private String eventId;
    private String eventName;
    private String eventDateTime;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    
    public EventResponse(String eventId, String eventName, LocalDateTime eventDateTime, String logradouro, String bairro, String cidade, String uf) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDateTime = TicketResponseDto.formatEventDateTime(eventDateTime);
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
}