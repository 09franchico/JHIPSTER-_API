package com.deshboard.br.service.mapper;

import com.deshboard.br.domain.Pessoa;
import com.deshboard.br.service.dto.PessoaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Pessoa} and its DTO {@link PessoaDTO}.
 */
@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {}
