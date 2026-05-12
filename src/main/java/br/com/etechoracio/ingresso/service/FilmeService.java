package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import br.com.etechoracio.ingresso.mapper.FilmeMapper;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<FilmeResponseDTO> findAll(){
        var filmes = filmeRepository.findAll();
        return filmeMapper.toResponseDTOList(filmes);
    }

    public List<Filme> buscarFilmesEmCartaz(SimNaoEnum emCartaz){return filmeRepository.findEmCartaz(SimNaoEnum.S);}

    @Autowired
    private FilmeMapper filmeMapper;


}
