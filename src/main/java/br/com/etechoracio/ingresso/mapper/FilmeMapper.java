package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmeMapper {
    List<FilmeResponseDTO> toResponseDTOList(List<Filme> entities);
}
