package com.empresa.ponto.control;

import com.empresa.ponto.model.entity.TimeRegister;
import com.empresa.ponto.model.view.TimeViewModel;
import com.empresa.ponto.repo.Mapper;
import com.empresa.ponto.repo.TimeRegisterRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class TimeController {

    @Autowired
    private TimeRegisterRepository timeRegisterRepository;
    private Mapper mapper;

    public TimeController(TimeRegisterRepository timeRegisterRepository, Mapper mapper) {
        this.timeRegisterRepository = timeRegisterRepository;
        this.mapper = mapper;
    }

    @GetMapping("/list")
    public Iterable<TimeRegister> list(@RequestParam Long employeeId) {
        return timeRegisterRepository.findAllByPeopleId(employeeId);
    }

    @PostMapping("/save")
    public TimeRegister save(@Validated @RequestBody TimeViewModel model) {
        return this.timeRegisterRepository.save(mapper.convertViewToEntity(model));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        timeRegisterRepository.deleteById(id);
    }
}
