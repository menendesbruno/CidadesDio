package com.github.menendesbruno.citiesapi.states;

import com.github.menendesbruno.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
