package com.amazon.khataApp.model;

import com.amazon.khataApp.repository.BusinessEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BusinessEventService {
    private final BusinessEventRepository businessEventRepository;

    public List<BusinessEvent> findAll() {
        return businessEventRepository.findAll();
    }

    public Optional<BusinessEvent> findById(Long id) {
        return businessEventRepository.findById(id);
    }

    public BusinessEvent save(BusinessEvent stock) {
        return businessEventRepository.save(stock);
    }

    public void deleteById(Long id) {
        businessEventRepository.deleteById(id);
    }
}
