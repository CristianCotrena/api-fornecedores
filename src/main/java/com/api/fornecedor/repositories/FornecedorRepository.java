package com.api.fornecedor.repositories;


import com.api.fornecedor.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, UUID> {
}


