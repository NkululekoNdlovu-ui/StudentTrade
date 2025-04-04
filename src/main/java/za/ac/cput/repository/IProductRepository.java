package za.ac.cput.repository;

import za.ac.cput.domain.Product;
import java.util.List;

public interface IProductRepository extends IRepository<Product, Integer> {
    List<Product> getAll();
}
