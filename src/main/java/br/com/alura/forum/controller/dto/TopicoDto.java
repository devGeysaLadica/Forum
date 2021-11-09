package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();

    }

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public Long getId() {
        return id;
    }

    public String gettitulo() {
        return titulo;
    }

    public String getmensagem() {
        return mensagem;
    }

    public LocalDateTime getdataCriacao() {
        return dataCriacao;
    }

    // recebe uma lista de topicos do tipo Topico. Retorna esses topicos em
    // TopicoDto
    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

}
