package com.amazon.khataApp.controller;

import com.amazon.khataApp.model.BusinessEvent;
import com.amazon.khataApp.model.BusinessEventDTO;
import com.amazon.khataApp.model.BusinessEventMapper;
import com.amazon.khataApp.model.BusinessEventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BusinessEventController {

    private final BusinessEventService businessEventService;
    private final BusinessEventMapper businessEventMapper;

    @GetMapping("/events")
    public ResponseEntity<List<BusinessEventDTO>> findAll() {
        return ResponseEntity.ok(businessEventMapper.toBusinessEventDTOs(businessEventService.findAll()));
    }

    @PostMapping("/events")
    public ResponseEntity<BusinessEventDTO> create(@RequestBody BusinessEventDTO businessEventDTO) {
        businessEventService.save(businessEventMapper.toBusinessEvent(businessEventDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(businessEventDTO);
    }

    @GetMapping("event/{id}")
    public ResponseEntity<BusinessEventDTO> findById(@PathVariable Long id) {
        Optional<BusinessEvent> product = businessEventService.findById(id);

        return ResponseEntity.ok(businessEventMapper.toBusinessEventDTO(product.get()));
    }



    @DeleteMapping("event/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        businessEventService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
