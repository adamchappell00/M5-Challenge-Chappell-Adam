package com.gamestoreinvoicing.client;

import com.gamestoreinvoicing.viewmodel.ConsoleViewModel;
import com.gamestoreinvoicing.viewmodel.GameViewModel;
import com.gamestoreinvoicing.viewmodel.TShirtViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "gamestore-catalog")
public interface ProductClient {

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.GET)
    public Optional<TShirtViewModel> getTShirtById(@PathVariable Long id);

    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public Optional<ConsoleViewModel> getConsoleById(@PathVariable Long id);

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public Optional<GameViewModel> getGameById(@PathVariable Long id);
}