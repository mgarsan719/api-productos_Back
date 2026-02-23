package ies.alcores.api_productos.repository;

import ies.alcores.api_productos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
